package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_multibanco.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_multibanco
 */
@Serializable(with = SourceTypeMultibanco.Serializer::class)
public class SourceTypeMultibanco(
  public val entity: String? = null,
  public val reference: String? = null,
  public val refundAccountHolderAddressCity: String? = null,
  public val refundAccountHolderAddressCountry: String? = null,
  public val refundAccountHolderAddressLine1: String? = null,
  public val refundAccountHolderAddressLine2: String? = null,
  public val refundAccountHolderAddressPostalCode: String? = null,
  public val refundAccountHolderAddressState: String? = null,
  public val refundAccountHolderName: String? = null,
  public val refundIban: String? = null,
) {
  public class Builder {
    public var entity: String? = null

    public var reference: String? = null

    public var refundAccountHolderAddressCity: String? = null

    public var refundAccountHolderAddressCountry: String? = null

    public var refundAccountHolderAddressLine1: String? = null

    public var refundAccountHolderAddressLine2: String? = null

    public var refundAccountHolderAddressPostalCode: String? = null

    public var refundAccountHolderAddressState: String? = null

    public var refundAccountHolderName: String? = null

    public var refundIban: String? = null

    public fun build(): SourceTypeMultibanco = SourceTypeMultibanco(
      entity = entity,
      reference = reference,
      refundAccountHolderAddressCity = refundAccountHolderAddressCity,
      refundAccountHolderAddressCountry = refundAccountHolderAddressCountry,
      refundAccountHolderAddressLine1 = refundAccountHolderAddressLine1,
      refundAccountHolderAddressLine2 = refundAccountHolderAddressLine2,
      refundAccountHolderAddressPostalCode = refundAccountHolderAddressPostalCode,
      refundAccountHolderAddressState = refundAccountHolderAddressState,
      refundAccountHolderName = refundAccountHolderName,
      refundIban = refundIban,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeMultibanco = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeMultibanco> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeMultibanco {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeMultibanco")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeMultibanco must be a JSON object")
      return SourceTypeMultibanco(
        entity = rawObject["entity"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reference = rawObject["reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderAddressCity = rawObject["refund_account_holder_address_city"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderAddressCountry = rawObject["refund_account_holder_address_country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderAddressLine1 = rawObject["refund_account_holder_address_line1"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderAddressLine2 = rawObject["refund_account_holder_address_line2"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderAddressPostalCode = rawObject["refund_account_holder_address_postal_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderAddressState = rawObject["refund_account_holder_address_state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundAccountHolderName = rawObject["refund_account_holder_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        refundIban = rawObject["refund_iban"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeMultibanco) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeMultibanco")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.entity?.let { put("entity", it) }
        value.reference?.let { put("reference", it) }
        value.refundAccountHolderAddressCity?.let { put("refund_account_holder_address_city", it) }
        value.refundAccountHolderAddressCountry?.let { put("refund_account_holder_address_country", it) }
        value.refundAccountHolderAddressLine1?.let { put("refund_account_holder_address_line1", it) }
        value.refundAccountHolderAddressLine2?.let { put("refund_account_holder_address_line2", it) }
        value.refundAccountHolderAddressPostalCode?.let { put("refund_account_holder_address_postal_code", it) }
        value.refundAccountHolderAddressState?.let { put("refund_account_holder_address_state", it) }
        value.refundAccountHolderName?.let { put("refund_account_holder_name", it) }
        value.refundIban?.let { put("refund_iban", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeMultibanco(block: SourceTypeMultibanco.Builder.() -> Unit): SourceTypeMultibanco = SourceTypeMultibanco.build(block)
