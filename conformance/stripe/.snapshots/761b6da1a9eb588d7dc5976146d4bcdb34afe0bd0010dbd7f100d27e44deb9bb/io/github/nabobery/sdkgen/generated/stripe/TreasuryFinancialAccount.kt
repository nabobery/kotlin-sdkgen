package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * Stripe Treasury provides users with a container for money called a FinancialAccount that is separate from their
 * Payments balance.
 * FinancialAccounts serve as the source and destination of Treasury’s money movement APIs.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.financial_account
 */
@Serializable(with = TreasuryFinancialAccount.Serializer::class)
public class TreasuryFinancialAccount(
  public val balance: TreasuryFinancialAccountsResourceBalance,
  /**
   * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
   */
  public val country: String,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  financialAddresses: List<TreasuryFinancialAccountsResourceFinancialAddress>,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineTreasuryFinancialAccountObjectValueX02ce063d,
  /**
   * Status of this FinancialAccount.
   */
  public val status: InlineTreasuryFinancialAccountStatusX91b48cf5,
  public val statusDetails: TreasuryFinancialAccountsResourceStatusDetails,
  supportedCurrencies: List<String>,
  activeFeatures: List<InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf>? = null,
  public val features: TreasuryFinancialAccountFeatures? = null,
  public val isDefault: Boolean? = null,
  metadata: Map<String, String>? = null,
  /**
   * The nickname for the FinancialAccount.
   */
  public val nickname: String? = null,
  pendingFeatures: List<InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9>? = null,
  /**
   * The set of functionalities that the platform can restrict on the FinancialAccount.
   */
  public val platformRestrictions:
      InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e? = null,
  restrictedFeatures: List<InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21>? = null,
) {
  /**
   * The set of credentials that resolve to a FinancialAccount.
   */
  public val financialAddresses: List<TreasuryFinancialAccountsResourceFinancialAddress> =
      financialAddresses.toList()

  /**
   * The currencies the FinancialAccount can hold a balance in. Three-letter [ISO currency
   * code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase.
   */
  public val supportedCurrencies: List<String> = supportedCurrencies.toList()

  /**
   * The array of paths to active Features in the Features hash.
   */
  public val activeFeatures: List<InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf>? =
      activeFeatures?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * The array of paths to pending Features in the Features hash.
   */
  public val pendingFeatures: List<InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9>? =
      pendingFeatures?.let { collection0 -> collection0.toList() }

  /**
   * The array of paths to restricted Features in the Features hash.
   */
  public val restrictedFeatures:
      List<InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21>? =
      restrictedFeatures?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var balanceValue: TreasuryFinancialAccountsResourceBalance? = null

    public var balance: TreasuryFinancialAccountsResourceBalance
      get() = requireNotNull(balanceValue) { "balance is required" }
      set(`value`) {
        balanceValue = value
      }

    private var countryValue: String? = null

    public var country: String
      get() = requireNotNull(countryValue) { "country is required" }
      set(`value`) {
        countryValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var financialAddressesValue: List<TreasuryFinancialAccountsResourceFinancialAddress>? =
        null

    public var financialAddresses: List<TreasuryFinancialAccountsResourceFinancialAddress>
      get() = requireNotNull(financialAddressesValue) { "financialAddresses is required" }.toList()
      set(`value`) {
        financialAddressesValue = value.toList()
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineTreasuryFinancialAccountObjectValueX02ce063d? = null

    public var objectValue: InlineTreasuryFinancialAccountObjectValueX02ce063d
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var statusValue: InlineTreasuryFinancialAccountStatusX91b48cf5? = null

    public var status: InlineTreasuryFinancialAccountStatusX91b48cf5
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var statusDetailsValue: TreasuryFinancialAccountsResourceStatusDetails? = null

    public var statusDetails: TreasuryFinancialAccountsResourceStatusDetails
      get() = requireNotNull(statusDetailsValue) { "statusDetails is required" }
      set(`value`) {
        statusDetailsValue = value
      }

    private var supportedCurrenciesValue: List<String>? = null

    public var supportedCurrencies: List<String>
      get() = requireNotNull(supportedCurrenciesValue) { "supportedCurrencies is required" }.toList()
      set(`value`) {
        supportedCurrenciesValue = value.toList()
      }

    private var activeFeaturesValue:
        List<InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf>? = null

    /**
     * The array of paths to active Features in the Features hash.
     */
    public var activeFeatures: List<InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf>?
      get() = activeFeaturesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        activeFeaturesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var features: TreasuryFinancialAccountFeatures? = null

    public var isDefault: Boolean? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The nickname for the FinancialAccount.
     */
    public var nickname: String? = null

    private var pendingFeaturesValue:
        List<InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9>? = null

    /**
     * The array of paths to pending Features in the Features hash.
     */
    public var pendingFeatures: List<InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9>?
      get() = pendingFeaturesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pendingFeaturesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The set of functionalities that the platform can restrict on the FinancialAccount.
     */
    public var platformRestrictions: InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e? =
        null

    private var restrictedFeaturesValue:
        List<InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21>? = null

    /**
     * The array of paths to restricted Features in the Features hash.
     */
    public var restrictedFeatures:
        List<InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21>?
      get() = restrictedFeaturesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        restrictedFeaturesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TreasuryFinancialAccount {
      check(balanceValue != null) { "balance is required" }
      check(countryValue != null) { "country is required" }
      check(createdValue != null) { "created is required" }
      check(financialAddressesValue != null) { "financialAddresses is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(statusValue != null) { "status is required" }
      check(statusDetailsValue != null) { "statusDetails is required" }
      check(supportedCurrenciesValue != null) { "supportedCurrencies is required" }
      return TreasuryFinancialAccount(
        balance = balance,
        country = country,
        created = created,
        financialAddresses = financialAddresses,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusDetails = statusDetails,
        supportedCurrencies = supportedCurrencies,
        activeFeatures = activeFeatures,
        features = features,
        isDefault = isDefault,
        metadata = metadata,
        nickname = nickname,
        pendingFeatures = pendingFeatures,
        platformRestrictions = platformRestrictions,
        restrictedFeatures = restrictedFeatures,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TreasuryFinancialAccount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TreasuryFinancialAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TreasuryFinancialAccount {
      val jsonDecoder = decoder.requireJsonDecoder("TreasuryFinancialAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TreasuryFinancialAccount must be a JSON object")
      val balance = json.decodeRequired<TreasuryFinancialAccountsResourceBalance>(rawObject, "balance")
      val country = json.decodeRequired<String>(rawObject, "country")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val financialAddresses = json.decodeRequired<List<TreasuryFinancialAccountsResourceFinancialAddress>>(rawObject, "financial_addresses")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineTreasuryFinancialAccountObjectValueX02ce063d>(rawObject, "object")
      val status = json.decodeRequired<InlineTreasuryFinancialAccountStatusX91b48cf5>(rawObject, "status")
      val statusDetails = json.decodeRequired<TreasuryFinancialAccountsResourceStatusDetails>(rawObject, "status_details")
      val supportedCurrencies = json.decodeRequired<List<String>>(rawObject, "supported_currencies")
      return TreasuryFinancialAccount(
        balance = balance,
        country = country,
        created = created,
        financialAddresses = financialAddresses,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        status = status,
        statusDetails = statusDetails,
        supportedCurrencies = supportedCurrencies,
        activeFeatures = rawObject["active_features"]?.let { json.decodeFromJsonElement<List<InlineTreasuryFinancialAccountActiveFeaturesItemXace1f2bf>>(it) },
        features = rawObject["features"]?.let { json.decodeFromJsonElement<TreasuryFinancialAccountFeatures>(it) },
        isDefault = rawObject["is_default"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        nickname = rawObject["nickname"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pendingFeatures = rawObject["pending_features"]?.let { json.decodeFromJsonElement<List<InlineTreasuryFinancialAccountPendingFeaturesItemXf9eb56f9>>(it) },
        platformRestrictions = rawObject["platform_restrictions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTreasuryFinancialAccountPlatformRestrictionsXaa010d7e?>(element) },
        restrictedFeatures = rawObject["restricted_features"]?.let { json.decodeFromJsonElement<List<InlineTreasuryFinancialAccountRestrictedFeaturesItemX253bcc21>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TreasuryFinancialAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("TreasuryFinancialAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("balance", json.encodeToJsonElement(value.balance))
        put("country", value.country)
        put("created", json.encodeToJsonElement(value.created))
        put("financial_addresses", json.encodeToJsonElement(value.financialAddresses))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("status", json.encodeToJsonElement(value.status))
        put("status_details", json.encodeToJsonElement(value.statusDetails))
        put("supported_currencies", json.encodeToJsonElement(value.supportedCurrencies))
        value.activeFeatures?.let { put("active_features", json.encodeToJsonElement(it)) }
        value.features?.let { put("features", json.encodeToJsonElement(it)) }
        value.isDefault?.let { put("is_default", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.nickname?.let { put("nickname", it) }
        value.pendingFeatures?.let { put("pending_features", json.encodeToJsonElement(it)) }
        value.platformRestrictions?.let { put("platform_restrictions", json.encodeToJsonElement(it)) }
        value.restrictedFeatures?.let { put("restricted_features", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun treasuryFinancialAccount(block: TreasuryFinancialAccount.Builder.() -> Unit): TreasuryFinancialAccount = TreasuryFinancialAccount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TreasuryFinancialAccount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
