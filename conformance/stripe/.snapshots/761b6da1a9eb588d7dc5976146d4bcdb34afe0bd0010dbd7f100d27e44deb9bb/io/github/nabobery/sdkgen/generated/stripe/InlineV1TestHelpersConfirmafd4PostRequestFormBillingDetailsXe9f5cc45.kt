package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45(
  public val address:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619? = null,
  public val email:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf? = null,
  public val name:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d? = null,
  public val phone:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db? = null,
  public val taxId: String? = null,
) {
  public class Builder {
    public var address:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619? = null

    public var email: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf?
        = null

    public var name: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d? =
        null

    public var phone: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db?
        = null

    public var taxId: String? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45 = InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataAddressXa5e54619>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataEmailX92fadbaf>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataNameXa6748e7d>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataPhoneXed6608db>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", json.encodeToJsonElement(it)) }
        value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
        value.taxId?.let { put("tax_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45(block: InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45 = InlineV1TestHelpersConfirmafd4PostRequestFormBillingDetailsXe9f5cc45.build(block)
