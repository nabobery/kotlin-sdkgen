package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1configurations/post/requestBody/content/application~1x-www-
 * form-urlencoded/schema
 */
@Serializable(with = InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4.Serializer::class)
public class InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4(
  /**
   * Information about the features available in the portal.
   */
  public val features: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7,
  /**
   * The business information shown to customers in the portal.
   */
  public val businessProfile:
      InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea? = null,
  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your website. This can
   * be [overriden](https://docs.stripe.com/api/customer_portal/sessions/create#create_portal_session-return_url) when
   * creating the session.
   */
  public val defaultReturnUrl:
      InlineV1BillingPortalConfigurationsPostRequestFormDefaultReturnUrlX3d8ade07? = null,
  expand: List<String>? = null,
  /**
   * The hosted login page for this configuration. Learn more about the portal login page in our [integration
   * docs](https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share).
   */
  public val loginPage:
      InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05? = null,
  metadata: Map<String, String>? = null,
  /**
   * The name of the configuration.
   */
  public val name: InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var featuresValue: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7?
        = null

    public var features: InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7
      get() = requireNotNull(featuresValue) { "features is required" }
      set(`value`) {
        featuresValue = value
      }

    /**
     * The business information shown to customers in the portal.
     */
    public var businessProfile:
        InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea? = null

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to your website. This can
     * be [overriden](https://docs.stripe.com/api/customer_portal/sessions/create#create_portal_session-return_url) when
     * creating the session.
     */
    public var defaultReturnUrl:
        InlineV1BillingPortalConfigurationsPostRequestFormDefaultReturnUrlX3d8ade07? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The hosted login page for this configuration. Learn more about the portal login page in our [integration
     * docs](https://stripe.com/docs/billing/subscriptions/integrating-customer-portal#share).
     */
    public var loginPage: InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05? =
        null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * The name of the configuration.
     */
    public var name: InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf? = null

    public fun build(): InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4 {
      check(featuresValue != null) { "features is required" }
      return InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4(
        features = features,
        businessProfile = businessProfile,
        defaultReturnUrl = defaultReturnUrl,
        expand = expand,
        loginPage = loginPage,
        metadata = metadata,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4 must be a JSON object")
      val features = json.decodeRequired<InlineV1BillingPortalConfigurationsPostRequestFormFeaturesXc522b9f7>(rawObject, "features")
      return InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4(
        features = features,
        businessProfile = rawObject["business_profile"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormBusinessProfileX568fb2ea>(it) },
        defaultReturnUrl = rawObject["default_return_url"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormDefaultReturnUrlX3d8ade07>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        loginPage = rawObject["login_page"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormLoginPageX87537f05>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalConfigurationsPostRequestFormNameXc37497bf>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("features", json.encodeToJsonElement(value.features))
        value.businessProfile?.let { put("business_profile", json.encodeToJsonElement(it)) }
        value.defaultReturnUrl?.let { put("default_return_url", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.loginPage?.let { put("login_page", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4(block: InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4.Builder.() -> Unit): InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4 = InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingPortalConfigurationsPostRequestFormXf0055dd4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
