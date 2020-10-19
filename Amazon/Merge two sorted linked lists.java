if(head1==null)
  {
    return head2;
  }
  if(head2==null)
  {
    return head1;
  }
  if(head1.val<head2.val)
  {
    head1.next=merge_sorted(head1.next,head2);
    return head1;
  }
  else
  {
    head2.next=merge_sorted(head1,head2.next);
    return head2
  }