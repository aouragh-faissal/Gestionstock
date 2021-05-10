<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="javascript:void(0)">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Gestion de Stock </div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <c:url value="/home" var ="home" />
      <li class="nav-item">
        <a class="nav-link" href="${home}">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span><fmt:message  key="common.dashboard" /></span></a>
      </li>
      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
       <c:url value="/article" var ="article" />
            <li class="nav-item">
        <a class="nav-link" href="${article}">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span><fmt:message  key="common.article" /></span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <c:url value="/client" var ="client" />
       <c:url value="/cdeclient" var ="cdeclient" />

      <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span><fmt:message  key="common.client" /></span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="${client}"><fmt:message  key="common.client" /></a>
            <a class="collapse-item" href="${cdeclient}"><fmt:message  key="common.client.commande" /></a>
          </div>
        </div>
      </li>
      
      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
            <c:url value="/fournisseur" var ="fournisseur" />
             <c:url value="/cdefournisseur" var ="cdefournisseur" />
      
            <!-- Nav Item - Pages Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
          <i class="fas fa-fw fa-cog"></i>
          <span><fmt:message  key="common.fournisseur" /></span>
        </a>
        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="${fournisseur}"><fmt:message  key="common.fournisseur" /></a>
            <a class="collapse-item" href="${cdefournisseur}"><fmt:message  key="common.fournisseur.commande" /></a>
          </div>
        </div>
      </li>
      
      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
      <c:url value="/stock" var ="stock" />
      
            <!-- Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link" href="${stock}">
          <i class="fas fa-fw fa-chart-area"></i>
          <span><fmt:message  key="common.stock" /></span></a>
      </li>
      
      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
      <c:url value="/vente" var ="vente" />
           <!-- Nav Item - Tables -->
      <li class="nav-item">
        <a class="nav-link" href="${vente}">
          <i class="fas fa-fw fa-table"></i>
          <span><fmt:message  key="common.vente" /></span></a>
      </li>
      
      <!-- Divider -->
      <hr class="sidebar-divider my-0">
      
      <c:url value="/utilisateur" var ="user" />
      <c:url value="/category" var ="category" />

      <!-- Nav Item - Utilities Collapse Menu -->
      <li class="nav-item">
        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
          <i class="fas fa-fw fa-wrench"></i>
          <span><fmt:message  key="common.parametrage" /></span>
        </a>
        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
          <div class="bg-white py-2 collapse-inner rounded">
            <a class="collapse-item" href="${user}"><fmt:message  key="common.parametrage.utilisateur" /></a>
            <a class="collapse-item" href="${category}"><fmt:message  key="common.parametrage.category" /></a>
          </div>
        </div>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    
    