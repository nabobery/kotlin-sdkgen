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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/billing_details
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332(
  public val address: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50? = null,
  public val email:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a? = null,
  public val name:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a? = null,
  public val phone:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX20511af3? = null,
  public val taxId: String? = null,
) {
  public class Builder {
    public var address: InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50? = null

    public var email:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a? = null

    public var name:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a? = null

    public var phone:
        InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX20511af3? = null

    public var taxId: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332(
      address = address,
      email = email,
      name = name,
      phone = phone,
      taxId = taxId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAddressX4ba29a50>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX30484e5a>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsNameX69a3849a>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsPhoneX20511af3>(it) },
        taxId = rawObject["tax_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsX6d3a4332.build(block)
