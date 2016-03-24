/**
 */
package library.impl;

import java.util.Collection;

import library.Author;
import library.Book;
import library.Library;
import library.LibraryPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link library.impl.LibraryImpl#getListAuthor <em>List Author</em>}</li>
 *   <li>{@link library.impl.LibraryImpl#getListBook <em>List Book</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends EObjectImpl implements Library {
	/**
	 * The cached value of the '{@link #getListAuthor() <em>List Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListAuthor()
	 * @generated
	 * @ordered
	 */
	protected Author listAuthor;

	/**
	 * The cached value of the '{@link #getListBook() <em>List Book</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListBook()
	 * @generated
	 * @ordered
	 */
	protected EList listBook;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getListAuthor() {
		return listAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListAuthor(Author newListAuthor, NotificationChain msgs) {
		Author oldListAuthor = listAuthor;
		listAuthor = newListAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__LIST_AUTHOR, oldListAuthor, newListAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListAuthor(Author newListAuthor) {
		if (newListAuthor != listAuthor) {
			NotificationChain msgs = null;
			if (listAuthor != null)
				msgs = ((InternalEObject)listAuthor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__LIST_AUTHOR, null, msgs);
			if (newListAuthor != null)
				msgs = ((InternalEObject)newListAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LibraryPackage.LIBRARY__LIST_AUTHOR, null, msgs);
			msgs = basicSetListAuthor(newListAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LibraryPackage.LIBRARY__LIST_AUTHOR, newListAuthor, newListAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getListBook() {
		if (listBook == null) {
			listBook = new EObjectResolvingEList(Book.class, this, LibraryPackage.LIBRARY__LIST_BOOK);
		}
		return listBook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				return basicSetListAuthor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				return getListAuthor();
			case LibraryPackage.LIBRARY__LIST_BOOK:
				return getListBook();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				setListAuthor((Author)newValue);
				return;
			case LibraryPackage.LIBRARY__LIST_BOOK:
				getListBook().clear();
				getListBook().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				setListAuthor((Author)null);
				return;
			case LibraryPackage.LIBRARY__LIST_BOOK:
				getListBook().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__LIST_AUTHOR:
				return listAuthor != null;
			case LibraryPackage.LIBRARY__LIST_BOOK:
				return listBook != null && !listBook.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LibraryImpl
