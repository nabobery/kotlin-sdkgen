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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_sofort.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_sofort
 */
@Serializable(with = SourceTypeSofort.Serializer::class)
public class SourceTypeSofort(
  public val bankCode: String? = null,
  public val bankName: String? = null,
  public val bic: String? = null,
  public val country: String? = null,
  public val ibanLast4: String? = null,
  public val preferredLanguage: String? = null,
  public val statementDescriptor: String? = null,
) {
  public class Builder {
    public var bankCode: String? = null

    public var bankName: String? = null

    public var bic: String? = null

    public var country: String? = null

    public var ibanLast4: String? = null

    public var preferredLanguage: String? = null

    public var statementDescriptor: String? = null

    public fun build(): SourceTypeSofort = SourceTypeSofort(
      bankCode = bankCode,
      bankName = bankName,
      bic = bic,
      country = country,
      ibanLast4 = ibanLast4,
      preferredLanguage = preferredLanguage,
      statementDescriptor = statementDescriptor,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeSofort = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeSofort> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeSofort {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeSofort")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeSofort must be a JSON object")
      return SourceTypeSofort(
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bankName = rawObject["bank_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        bic = rawObject["bic"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        ibanLast4 = rawObject["iban_last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        preferredLanguage = rawObject["preferred_language"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeSofort) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeSofort")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankCode?.let { put("bank_code", it) }
        value.bankName?.let { put("bank_name", it) }
        value.bic?.let { put("bic", it) }
        value.country?.let { put("country", it) }
        value.ibanLast4?.let { put("iban_last4", it) }
        value.preferredLanguage?.let { put("preferred_language", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeSofort(block: SourceTypeSofort.Builder.() -> Unit): SourceTypeSofort = SourceTypeSofort.build(block)
