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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_au_becs_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_au_becs_debit
 */
@Serializable(with = SourceTypeAuBecsDebit.Serializer::class)
public class SourceTypeAuBecsDebit(
  public val bsbNumber: String? = null,
  public val fingerprint: String? = null,
  public val last4: String? = null,
) {
  public class Builder {
    public var bsbNumber: String? = null

    public var fingerprint: String? = null

    public var last4: String? = null

    public fun build(): SourceTypeAuBecsDebit = SourceTypeAuBecsDebit(
      bsbNumber = bsbNumber,
      fingerprint = fingerprint,
      last4 = last4,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeAuBecsDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceTypeAuBecsDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeAuBecsDebit {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeAuBecsDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeAuBecsDebit must be a JSON object")
      return SourceTypeAuBecsDebit(
        bsbNumber = rawObject["bsb_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeAuBecsDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeAuBecsDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bsbNumber?.let { put("bsb_number", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeAuBecsDebit(block: SourceTypeAuBecsDebit.Builder.() -> Unit): SourceTypeAuBecsDebit = SourceTypeAuBecsDebit.build(block)
