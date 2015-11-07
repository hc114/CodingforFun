   function findLargestSmallerKey(root, x):
      result = null
      while (root != null):
         if (root.key < x):
            result = root.key
            root = root.right
         else
            root = root.left
      return resul
   