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
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1ChargesPostRequestFormXa27d03d9.Serializer::class)
public class InlineV1ChargesPostRequestFormXa27d03d9(
  /**
   * The ID of an existing customer that will be associated with this request. This field may only be updated if there
   * is no existing associated customer with this charge.
   */
  public val customer: String? = null,
  /**
   * An arbitrary string which you can attach to a charge object. It is displayed when in the web interface alongside
   * the charge. Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails
   * will include the `description` of the charge(s) that they are describing.
   */
  public val description: String? = null,
  expand: List<String>? = null,
  /**
   * A set of key-value pairs you can attach to a charge giving information about its riskiness. If you believe a charge
   * is fraudulent, include a `user_report` key with a value of `fraudulent`. If you believe a charge is safe, include a
   * `user_report` key with a value of `safe`. Stripe will use the information you send to improve our fraud detection
   * algorithms.
   */
  public val fraudDetails: InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1ChargesPostRequestFormMetadataXae7bfa5e? = null,
  /**
   * This is the email address that the receipt for this charge will be sent to. If this field is updated, then a new
   * email receipt will be sent to the updated address.
   */
  public val receiptEmail: String? = null,
  /**
   * Shipping information for the charge. Helps prevent fraud on charges for physical goods.
   */
  public val shipping: InlineV1ChargesPostRequestFormShippingX03643664? = null,
  /**
   * A string that identifies this transaction as part of a group. `transfer_group` may only be provided if it has not
   * been set. See the [Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
   */
  public val transferGroup: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The ID of an existing customer that will be associated with this request. This field may only be updated if there
     * is no existing associated customer with this charge.
     */
    public var customer: String? = null

    /**
     * An arbitrary string which you can attach to a charge object. It is displayed when in the web interface alongside
     * the charge. Note that if you use Stripe to send automatic email receipts to your customers, your receipt emails
     * will include the `description` of the charge(s) that they are describing.
     */
    public var description: String? = null

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
     * A set of key-value pairs you can attach to a charge giving information about its riskiness. If you believe a
     * charge is fraudulent, include a `user_report` key with a value of `fraudulent`. If you believe a charge is safe,
     * include a `user_report` key with a value of `safe`. Stripe will use the information you send to improve our fraud
     * detection algorithms.
     */
    public var fraudDetails: InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1ChargesPostRequestFormMetadataXae7bfa5e? = null

    /**
     * This is the email address that the receipt for this charge will be sent to. If this field is updated, then a new
     * email receipt will be sent to the updated address.
     */
    public var receiptEmail: String? = null

    /**
     * Shipping information for the charge. Helps prevent fraud on charges for physical goods.
     */
    public var shipping: InlineV1ChargesPostRequestFormShippingX03643664? = null

    /**
     * A string that identifies this transaction as part of a group. `transfer_group` may only be provided if it has not
     * been set. See the [Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
     */
    public var transferGroup: String? = null

    public fun build(): InlineV1ChargesPostRequestFormXa27d03d9 = InlineV1ChargesPostRequestFormXa27d03d9(
      customer = customer,
      description = description,
      expand = expand,
      fraudDetails = fraudDetails,
      metadata = metadata,
      receiptEmail = receiptEmail,
      shipping = shipping,
      transferGroup = transferGroup,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormXa27d03d9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1ChargesPostRequestFormXa27d03d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormXa27d03d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormXa27d03d9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesPostRequestFormXa27d03d9 must be a JSON object")
      return InlineV1ChargesPostRequestFormXa27d03d9(
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        fraudDetails = rawObject["fraud_details"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormFraudDetailsXdf29dbc4>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormMetadataXae7bfa5e>(it) },
        receiptEmail = rawObject["receipt_email"]?.let { json.decodeFromJsonElement<String>(it) },
        shipping = rawObject["shipping"]?.let { json.decodeFromJsonElement<InlineV1ChargesPostRequestFormShippingX03643664>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormXa27d03d9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormXa27d03d9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.customer?.let { put("customer", it) }
        value.description?.let { put("description", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.fraudDetails?.let { put("fraud_details", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", it) }
        value.shipping?.let { put("shipping", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesPostRequestFormXa27d03d9(block: InlineV1ChargesPostRequestFormXa27d03d9.Builder.() -> Unit): InlineV1ChargesPostRequestFormXa27d03d9 = InlineV1ChargesPostRequestFormXa27d03d9.build(block)
