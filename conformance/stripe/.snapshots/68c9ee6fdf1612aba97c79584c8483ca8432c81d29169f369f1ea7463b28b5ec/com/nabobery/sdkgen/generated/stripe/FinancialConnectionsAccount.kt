package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A Financial Connections Account represents an account that exists outside of Stripe, to which you have been granted
 * some degree of access.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_connections.account
 */
@Serializable(with = FinancialConnectionsAccount.Serializer::class)
public class FinancialConnectionsAccount(
  /**
   * The type of the account. Account category is further divided in `subcategory`.
   */
  public val category: InlineFinancialConnectionsAccountCategoryX1214ba08,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * The name of the institution that holds this account.
   */
  public val institutionName: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineFinancialConnectionsAccountObjectValueXedf79fc2,
  /**
   * The status of the link to the account.
   */
  public val status: InlineFinancialConnectionsAccountStatusXdb3bb633,
  /**
   * If `category` is `cash`, one of:
   *
   * - `checking`
   * - `savings`
   * - `other`
   *
   * If `category` is `credit`, one of:
   *
   * - `mortgage`
   * - `line_of_credit`
   * - `credit_card`
   * - `other`
   *
   * If `category` is `investment` or `other`, this will be `other`.
   */
  public val subcategory: InlineFinancialConnectionsAccountSubcategoryX5a1e63f2,
  supportedPaymentMethodTypes: List<InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7>,
  /**
   * The account holder that this account belongs to.
   */
  public val accountHolder: InlineFinancialConnectionsAccountAccountHolderXc752c398? = null,
  accountNumbers: List<BankConnectionsResourceAccountNumberDetails>? = null,
  /**
   * The most recent information about the account's balance.
   */
  public val balance: InlineFinancialConnectionsAccountBalanceX17a8ea78? = null,
  /**
   * The state of the most recent attempt to refresh the account balance.
   */
  public val balanceRefresh: InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5? = null,
  /**
   * A human-readable name that has been assigned to this account, either by the account holder or by the institution.
   */
  public val displayName: String? = null,
  /**
   * The last 4 digits of the account number. If present, this will be 4 numeric characters.
   */
  public val last4: String? = null,
  /**
   * The most recent information about the account's owners.
   */
  public val ownership: InlineFinancialConnectionsAccountOwnershipX0d638327? = null,
  /**
   * The state of the most recent attempt to refresh the account owners.
   */
  public val ownershipRefresh: InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a? = null,
  permissions: List<InlineFinancialConnectionsAccountPermissionsItemXe49614b2>? = null,
  public val statusDetails: BankConnectionsResourceAccountStatusDetails? = null,
  subscriptions: List<InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146>? = null,
  /**
   * The state of the most recent attempt to refresh the account transactions.
   */
  public val transactionRefresh:
      InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83? = null,
) {
  /**
   * The [PaymentMethod type](https://docs.stripe.com/api/payment_methods/object#payment_method_object-type)(s) that can
   * be created from this account.
   */
  public val supportedPaymentMethodTypes:
      List<InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7> =
      supportedPaymentMethodTypes.toList()

  /**
   * Details about the account numbers.
   */
  public val accountNumbers: List<BankConnectionsResourceAccountNumberDetails>? =
      accountNumbers?.let { collection0 -> collection0.toList() }

  /**
   * The list of permissions granted by this account.
   */
  public val permissions: List<InlineFinancialConnectionsAccountPermissionsItemXe49614b2>? =
      permissions?.let { collection0 -> collection0.toList() }

  /**
   * The list of data refresh subscriptions requested on this account.
   */
  public val subscriptions: List<InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146>? =
      subscriptions?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var categoryValue: InlineFinancialConnectionsAccountCategoryX1214ba08? = null

    public var category: InlineFinancialConnectionsAccountCategoryX1214ba08
      get() = requireNotNull(categoryValue) { "category is required" }
      set(`value`) {
        categoryValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var institutionNameValue: String? = null

    public var institutionName: String
      get() = requireNotNull(institutionNameValue) { "institutionName is required" }
      set(`value`) {
        institutionNameValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineFinancialConnectionsAccountObjectValueXedf79fc2? = null

    public var objectValue: InlineFinancialConnectionsAccountObjectValueXedf79fc2
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineFinancialConnectionsAccountStatusXdb3bb633? = null

    public var status: InlineFinancialConnectionsAccountStatusXdb3bb633
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var subcategoryValue: InlineFinancialConnectionsAccountSubcategoryX5a1e63f2? = null

    public var subcategory: InlineFinancialConnectionsAccountSubcategoryX5a1e63f2
      get() = requireNotNull(subcategoryValue) { "subcategory is required" }
      set(`value`) {
        subcategoryValue = value
      }

    private var supportedPaymentMethodTypesValue:
        List<InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7>? = null

    public var supportedPaymentMethodTypes:
        List<InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7>
      get() = requireNotNull(supportedPaymentMethodTypesValue) { "supportedPaymentMethodTypes is required" }.toList()
      set(`value`) {
        supportedPaymentMethodTypesValue = value.toList()
      }

    /**
     * The account holder that this account belongs to.
     */
    public var accountHolder: InlineFinancialConnectionsAccountAccountHolderXc752c398? = null

    private var accountNumbersValue: List<BankConnectionsResourceAccountNumberDetails>? = null

    /**
     * Details about the account numbers.
     */
    public var accountNumbers: List<BankConnectionsResourceAccountNumberDetails>?
      get() = accountNumbersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        accountNumbersValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The most recent information about the account's balance.
     */
    public var balance: InlineFinancialConnectionsAccountBalanceX17a8ea78? = null

    /**
     * The state of the most recent attempt to refresh the account balance.
     */
    public var balanceRefresh: InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5? = null

    /**
     * A human-readable name that has been assigned to this account, either by the account holder or by the institution.
     */
    public var displayName: String? = null

    /**
     * The last 4 digits of the account number. If present, this will be 4 numeric characters.
     */
    public var last4: String? = null

    /**
     * The most recent information about the account's owners.
     */
    public var ownership: InlineFinancialConnectionsAccountOwnershipX0d638327? = null

    /**
     * The state of the most recent attempt to refresh the account owners.
     */
    public var ownershipRefresh: InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a? = null

    private var permissionsValue: List<InlineFinancialConnectionsAccountPermissionsItemXe49614b2>? =
        null

    /**
     * The list of permissions granted by this account.
     */
    public var permissions: List<InlineFinancialConnectionsAccountPermissionsItemXe49614b2>?
      get() = permissionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        permissionsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var statusDetails: BankConnectionsResourceAccountStatusDetails? = null

    private var subscriptionsValue:
        List<InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146>? = null

    /**
     * The list of data refresh subscriptions requested on this account.
     */
    public var subscriptions: List<InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146>?
      get() = subscriptionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        subscriptionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The state of the most recent attempt to refresh the account transactions.
     */
    public var transactionRefresh: InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83? =
        null

    public fun build(): FinancialConnectionsAccount {
      check(categoryValue != null) { "category is required" }
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(institutionNameValue != null) { "institutionName is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(subcategoryValue != null) { "subcategory is required" }
      check(supportedPaymentMethodTypesValue != null) { "supportedPaymentMethodTypes is required" }
      return FinancialConnectionsAccount(
        category = category,
        created = created,
        id = id,
        institutionName = institutionName,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        subcategory = subcategory,
        supportedPaymentMethodTypes = supportedPaymentMethodTypes,
        accountHolder = accountHolder,
        accountNumbers = accountNumbers,
        balance = balance,
        balanceRefresh = balanceRefresh,
        displayName = displayName,
        last4 = last4,
        ownership = ownership,
        ownershipRefresh = ownershipRefresh,
        permissions = permissions,
        statusDetails = statusDetails,
        subscriptions = subscriptions,
        transactionRefresh = transactionRefresh,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FinancialConnectionsAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FinancialConnectionsAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FinancialConnectionsAccount {
      val jsonDecoder = decoder.requireJsonDecoder("FinancialConnectionsAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FinancialConnectionsAccount must be a JSON object")
      val category = json.decodeRequired<InlineFinancialConnectionsAccountCategoryX1214ba08>(rawObject, "category")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val institutionName = json.decodeRequired<String>(rawObject, "institution_name")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineFinancialConnectionsAccountObjectValueXedf79fc2>(rawObject, "object")
      val status = json.decodeRequired<InlineFinancialConnectionsAccountStatusXdb3bb633>(rawObject, "status")
      val subcategory = json.decodeRequired<InlineFinancialConnectionsAccountSubcategoryX5a1e63f2>(rawObject, "subcategory")
      val supportedPaymentMethodTypes = json.decodeRequired<List<InlineFinancialConnectionsAccountSupportedPaymentMethodTypesItemXd2320cf7>>(rawObject, "supported_payment_method_types")
      return FinancialConnectionsAccount(
        category = category,
        created = created,
        id = id,
        institutionName = institutionName,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        subcategory = subcategory,
        supportedPaymentMethodTypes = supportedPaymentMethodTypes,
        accountHolder = rawObject["account_holder"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsAccountAccountHolderXc752c398?>(element) },
        accountNumbers = rawObject["account_numbers"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<BankConnectionsResourceAccountNumberDetails>?>(element) },
        balance = rawObject["balance"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsAccountBalanceX17a8ea78?>(element) },
        balanceRefresh = rawObject["balance_refresh"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsAccountBalanceRefreshX1bb1e3e5?>(element) },
        displayName = rawObject["display_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ownership = rawObject["ownership"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsAccountOwnershipX0d638327?>(element) },
        ownershipRefresh = rawObject["ownership_refresh"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsAccountOwnershipRefreshXa966e25a?>(element) },
        permissions = rawObject["permissions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineFinancialConnectionsAccountPermissionsItemXe49614b2>?>(element) },
        statusDetails = rawObject["status_details"]?.let { json.decodeFromJsonElement<BankConnectionsResourceAccountStatusDetails>(it) },
        subscriptions = rawObject["subscriptions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlineFinancialConnectionsAccountSubscriptionsItemX9bd93146>?>(element) },
        transactionRefresh = rawObject["transaction_refresh"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineFinancialConnectionsAccountTransactionRefreshX21e2ce83?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FinancialConnectionsAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("FinancialConnectionsAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("category", json.encodeToJsonElement(value.category))
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("institution_name", value.institutionName)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("subcategory", json.encodeToJsonElement(value.subcategory))
        put("supported_payment_method_types", json.encodeToJsonElement(value.supportedPaymentMethodTypes))
        value.accountHolder?.let { put("account_holder", json.encodeToJsonElement(it)) }
        value.accountNumbers?.let { put("account_numbers", json.encodeToJsonElement(it)) }
        value.balance?.let { put("balance", json.encodeToJsonElement(it)) }
        value.balanceRefresh?.let { put("balance_refresh", json.encodeToJsonElement(it)) }
        value.displayName?.let { put("display_name", it) }
        value.last4?.let { put("last4", it) }
        value.ownership?.let { put("ownership", json.encodeToJsonElement(it)) }
        value.ownershipRefresh?.let { put("ownership_refresh", json.encodeToJsonElement(it)) }
        value.permissions?.let { put("permissions", json.encodeToJsonElement(it)) }
        value.statusDetails?.let { put("status_details", json.encodeToJsonElement(it)) }
        value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
        value.transactionRefresh?.let { put("transaction_refresh", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun financialConnectionsAccount(block: FinancialConnectionsAccount.Builder.() -> Unit): FinancialConnectionsAccount = FinancialConnectionsAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FinancialConnectionsAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
