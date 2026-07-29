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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_ach_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_ach_debit
 */
@Serializable(with = SourceTypeAchDebit.Serializer::class)
public class SourceTypeAchDebit(
  public val bankName: String? = null,
  public val country: String? = null,
  public val fingerprint: String? = null,
  public val last4: String? = null,
  public val routingNumber: String? = null,
  public val type: String? = null,
) {
  public class Builder {
    public var bankName: String? = null

    public var country: String? = null

    public var fingerprint: String? = null

    public var last4: String? = null

    public var routingNumber: String? = null

    public var type: String? = null

    public fun build(): SourceTypeAchDebit = SourceTypeAchDebit(
      bankName = bankName,
      country = country,
      fingerprint = fingerprint,
      last4 = last4,
      routingNumber = routingNumber,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeAchDebit = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SourceTypeAchDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeAchDebit {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeAchDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeAchDebit must be a JSON object")
      return SourceTypeAchDebit(
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        routingNumber = rawObject["routing_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        type = rawObject["type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeAchDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeAchDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankName?.let { put("bank_name", it) }
        value.country?.let { put("country", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.routingNumber?.let { put("routing_number", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeAchDebit(block: SourceTypeAchDebit.Builder.() -> Unit): SourceTypeAchDebit = SourceTypeAchDebit.build(block)
