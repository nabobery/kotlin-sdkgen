package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormXa2072220.Serializer::class)
public class InlineV1BillingPortalSessionsPostRequestFormXa2072220(
  /**
   * The ID of an existing [configuration](https://docs.stripe.com/api/customer_portal/configurations) to use for this
   * session, describing its functionality and features. If not specified, the session uses the default configuration.
   */
  public val configuration: String? = null,
  /**
   * The ID of an existing customer.
   */
  public val customer: String? = null,
  /**
   * The ID of an existing account.
   */
  public val customerAccount: String? = null,
  expand: List<String>? = null,
  /**
   * Information about a specific flow for the customer to go through. See the
   * [docs](https://docs.stripe.com/customer-management/portal-deep-links) to learn more about using customer portal
   * deep links and flows.
   */
  public val flowData: InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c? = null,
  /**
   * The IETF language tag of the locale customer portal is displayed in. If blank or auto, the customer’s
   * `preferred_locales` or browser’s locale is used.
   */
  public val locale: InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84? = null,
  /**
   * The `on_behalf_of` account to use for this session. When specified, only subscriptions and invoices with this
   * `on_behalf_of` account appear in the portal. For more information, see the
   * [docs](https://docs.stripe.com/connect/separate-charges-and-transfers#settlement-merchant). Use the [Accounts
   * API](https://docs.stripe.com/api/accounts/object#account_object-settings-branding) to modify the `on_behalf_of`
   * account's branding settings, which the portal displays.
   */
  public val onBehalfOf: String? = null,
  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your website.
   */
  public val returnUrl: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The ID of an existing [configuration](https://docs.stripe.com/api/customer_portal/configurations) to use for this
     * session, describing its functionality and features. If not specified, the session uses the default configuration.
     */
    public var configuration: String? = null

    /**
     * The ID of an existing customer.
     */
    public var customer: String? = null

    /**
     * The ID of an existing account.
     */
    public var customerAccount: String? = null

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
     * Information about a specific flow for the customer to go through. See the
     * [docs](https://docs.stripe.com/customer-management/portal-deep-links) to learn more about using customer portal
     * deep links and flows.
     */
    public var flowData: InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c? = null

    /**
     * The IETF language tag of the locale customer portal is displayed in. If blank or auto, the customer’s
     * `preferred_locales` or browser’s locale is used.
     */
    public var locale: InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84? = null

    /**
     * The `on_behalf_of` account to use for this session. When specified, only subscriptions and invoices with this
     * `on_behalf_of` account appear in the portal. For more information, see the
     * [docs](https://docs.stripe.com/connect/separate-charges-and-transfers#settlement-merchant). Use the [Accounts
     * API](https://docs.stripe.com/api/accounts/object#account_object-settings-branding) to modify the `on_behalf_of`
     * account's branding settings, which the portal displays.
     */
    public var onBehalfOf: String? = null

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to your website.
     */
    public var returnUrl: String? = null

    public fun build(): InlineV1BillingPortalSessionsPostRequestFormXa2072220 = InlineV1BillingPortalSessionsPostRequestFormXa2072220(
      configuration = configuration,
      customer = customer,
      customerAccount = customerAccount,
      expand = expand,
      flowData = flowData,
      locale = locale,
      onBehalfOf = onBehalfOf,
      returnUrl = returnUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormXa2072220 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormXa2072220> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormXa2072220 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingPortalSessionsPostRequestFormXa2072220")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingPortalSessionsPostRequestFormXa2072220 must be a JSON object")
      return InlineV1BillingPortalSessionsPostRequestFormXa2072220(
        configuration = rawObject["configuration"]?.let { json.decodeFromJsonElement<String>(it) },
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        flowData = rawObject["flow_data"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormFlowDataX3ab0e83c>(it) },
        locale = rawObject["locale"]?.let { json.decodeFromJsonElement<InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84>(it) },
        onBehalfOf = rawObject["on_behalf_of"]?.let { json.decodeFromJsonElement<String>(it) },
        returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormXa2072220) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingPortalSessionsPostRequestFormXa2072220")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.configuration?.let { put("configuration", it) }
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.flowData?.let { put("flow_data", json.encodeToJsonElement(it)) }
        value.locale?.let { put("locale", json.encodeToJsonElement(it)) }
        value.onBehalfOf?.let { put("on_behalf_of", it) }
        value.returnUrl?.let { put("return_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingPortalSessionsPostRequestFormXa2072220(block: InlineV1BillingPortalSessionsPostRequestFormXa2072220.Builder.() -> Unit): InlineV1BillingPortalSessionsPostRequestFormXa2072220 = InlineV1BillingPortalSessionsPostRequestFormXa2072220.build(block)
