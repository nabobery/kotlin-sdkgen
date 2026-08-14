package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class BillingPortalConfigurationView internal constructor(
  public val active: Boolean,
  public val application: InlineBillingPortalConfigurationApplicationXa56c0eb7? = null,
  @SerialName("business_profile")
  public val businessProfile: PortalBusinessProfile,
  public val created: Int,
  @SerialName("default_return_url")
  public val defaultReturnUrl: String? = null,
  public val features: PortalFeatures,
  public val id: String,
  @SerialName("is_default")
  public val isDefault: Boolean,
  public val livemode: Boolean,
  @SerialName("login_page")
  public val loginPage: PortalLoginPage,
  public val metadata: Map<String, String>? = null,
  public val name: String? = null,
  @SerialName("object")
  public val objectValue: InlineBillingPortalConfigurationObjectValueX67d405e0,
  public val updated: Int,
)

/**
 * A portal configuration describes the functionality and behavior you embed in a portal session. Related guide:
 * [Configure the customer portal](/customer-management/configure-portal).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.configuration
 */
@Serializable(with = BillingPortalConfiguration.Serializer::class)
public class BillingPortalConfiguration(
  /**
   * Whether the configuration is active and can be used to create portal sessions.
   */
  public val active: Boolean,
  public val businessProfile: PortalBusinessProfile,
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  public val features: PortalFeatures,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * Whether the configuration is the default. If `true`, this configuration can be managed in the Dashboard and portal
   * sessions will use this configuration unless it is overriden when creating the session.
   */
  public val isDefault: Boolean,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  public val loginPage: PortalLoginPage,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineBillingPortalConfigurationObjectValueX67d405e0,
  /**
   * Time at which the object was last updated. Measured in seconds since the Unix epoch.
   */
  public val updated: Int,
  /**
   * ID of the Connect Application that created the configuration.
   */
  public val application: InlineBillingPortalConfigurationApplicationXa56c0eb7? = null,
  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your website. This can
   * be [overriden](https://docs.stripe.com/api/customer_portal/sessions/create#create_portal_session-return_url) when
   * creating the session.
   */
  public val defaultReturnUrl: String? = null,
  metadata: Map<String, String>? = null,
  /**
   * The name of the configuration.
   */
  public val name: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var activeValue: Boolean? = null

    public var active: Boolean
      get() = requireNotNull(activeValue) { "active is required" }
      set(`value`) {
        activeValue = value
      }

    private var businessProfileValue: PortalBusinessProfile? = null

    public var businessProfile: PortalBusinessProfile
      get() = requireNotNull(businessProfileValue) { "businessProfile is required" }
      set(`value`) {
        businessProfileValue = value
      }

    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var featuresValue: PortalFeatures? = null

    public var features: PortalFeatures
      get() = requireNotNull(featuresValue) { "features is required" }
      set(`value`) {
        featuresValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var isDefaultValue: Boolean? = null

    public var isDefault: Boolean
      get() = requireNotNull(isDefaultValue) { "isDefault is required" }
      set(`value`) {
        isDefaultValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var loginPageValue: PortalLoginPage? = null

    public var loginPage: PortalLoginPage
      get() = requireNotNull(loginPageValue) { "loginPage is required" }
      set(`value`) {
        loginPageValue = value
      }

    private var objectValueValue: InlineBillingPortalConfigurationObjectValueX67d405e0? = null

    public var objectValue: InlineBillingPortalConfigurationObjectValueX67d405e0
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var updatedValue: Int? = null

    public var updated: Int
      get() = requireNotNull(updatedValue) { "updated is required" }
      set(`value`) {
        updatedValue = value
      }

    /**
     * ID of the Connect Application that created the configuration.
     */
    public var application: InlineBillingPortalConfigurationApplicationXa56c0eb7? = null

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to your website. This can
     * be [overriden](https://docs.stripe.com/api/customer_portal/sessions/create#create_portal_session-return_url) when
     * creating the session.
     */
    public var defaultReturnUrl: String? = null

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
     * The name of the configuration.
     */
    public var name: String? = null

    public fun build(): BillingPortalConfiguration {
      check(activeValue != null) { "active is required" }
      check(businessProfileValue != null) { "businessProfile is required" }
      check(createdValue != null) { "created is required" }
      check(featuresValue != null) { "features is required" }
      check(idValue != null) { "id is required" }
      check(isDefaultValue != null) { "isDefault is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(loginPageValue != null) { "loginPage is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(updatedValue != null) { "updated is required" }
      return BillingPortalConfiguration(
        active = active,
        businessProfile = businessProfile,
        created = created,
        features = features,
        id = id,
        isDefault = isDefault,
        livemode = livemode,
        loginPage = loginPage,
        objectValue = objectValue,
        updated = updated,
        application = application,
        defaultReturnUrl = defaultReturnUrl,
        metadata = metadata,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingPortalConfiguration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingPortalConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingPortalConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("BillingPortalConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingPortalConfiguration must be a JSON object")
      val active = json.decodeRequired<Boolean>(rawObject, "active")
      val businessProfile = json.decodeRequired<PortalBusinessProfile>(rawObject, "business_profile")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val features = json.decodeRequired<PortalFeatures>(rawObject, "features")
      val id = json.decodeRequired<String>(rawObject, "id")
      val isDefault = json.decodeRequired<Boolean>(rawObject, "is_default")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val loginPage = json.decodeRequired<PortalLoginPage>(rawObject, "login_page")
      val objectValue = json.decodeRequired<InlineBillingPortalConfigurationObjectValueX67d405e0>(rawObject, "object")
      val updated = json.decodeRequired<Int>(rawObject, "updated")
      return BillingPortalConfiguration(
        active = active,
        businessProfile = businessProfile,
        created = created,
        features = features,
        id = id,
        isDefault = isDefault,
        livemode = livemode,
        loginPage = loginPage,
        objectValue = objectValue,
        updated = updated,
        application = rawObject["application"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineBillingPortalConfigurationApplicationXa56c0eb7?>(element) },
        defaultReturnUrl = rawObject["default_return_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        name = rawObject["name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingPortalConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingPortalConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("active", json.encodeToJsonElement(value.active))
        put("business_profile", json.encodeToJsonElement(value.businessProfile))
        put("created", json.encodeToJsonElement(value.created))
        put("features", json.encodeToJsonElement(value.features))
        put("id", value.id)
        put("is_default", json.encodeToJsonElement(value.isDefault))
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("login_page", json.encodeToJsonElement(value.loginPage))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("updated", json.encodeToJsonElement(value.updated))
        value.application?.let { put("application", json.encodeToJsonElement(it)) }
        value.defaultReturnUrl?.let { put("default_return_url", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingPortalConfiguration(block: BillingPortalConfiguration.Builder.() -> Unit): BillingPortalConfiguration = BillingPortalConfiguration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("BillingPortalConfiguration is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
