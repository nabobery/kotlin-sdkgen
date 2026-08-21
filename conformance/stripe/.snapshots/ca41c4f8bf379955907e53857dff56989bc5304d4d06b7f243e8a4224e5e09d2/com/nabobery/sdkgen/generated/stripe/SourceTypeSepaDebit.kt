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
 * Generated model for sdkgen://source/openapi.json#/components/schemas/source_type_sepa_debit.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/source_type_sepa_debit
 */
@Serializable(with = SourceTypeSepaDebit.Serializer::class)
public class SourceTypeSepaDebit(
  public val bankCode: String? = null,
  public val branchCode: String? = null,
  public val country: String? = null,
  public val fingerprint: String? = null,
  public val last4: String? = null,
  public val mandateReference: String? = null,
  public val mandateUrl: String? = null,
) {
  public class Builder {
    public var bankCode: String? = null

    public var branchCode: String? = null

    public var country: String? = null

    public var fingerprint: String? = null

    public var last4: String? = null

    public var mandateReference: String? = null

    public var mandateUrl: String? = null

    public fun build(): SourceTypeSepaDebit = SourceTypeSepaDebit(
      bankCode = bankCode,
      branchCode = branchCode,
      country = country,
      fingerprint = fingerprint,
      last4 = last4,
      mandateReference = mandateReference,
      mandateUrl = mandateUrl,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SourceTypeSepaDebit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SourceTypeSepaDebit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SourceTypeSepaDebit {
      val jsonDecoder = decoder.requireJsonDecoder("SourceTypeSepaDebit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SourceTypeSepaDebit must be a JSON object")
      return SourceTypeSepaDebit(
        bankCode = rawObject["bank_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        branchCode = rawObject["branch_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        country = rawObject["country"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        fingerprint = rawObject["fingerprint"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        last4 = rawObject["last4"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandateReference = rawObject["mandate_reference"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        mandateUrl = rawObject["mandate_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SourceTypeSepaDebit) {
      val jsonEncoder = encoder.requireJsonEncoder("SourceTypeSepaDebit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.bankCode?.let { put("bank_code", it) }
        value.branchCode?.let { put("branch_code", it) }
        value.country?.let { put("country", it) }
        value.fingerprint?.let { put("fingerprint", it) }
        value.last4?.let { put("last4", it) }
        value.mandateReference?.let { put("mandate_reference", it) }
        value.mandateUrl?.let { put("mandate_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun sourceTypeSepaDebit(block: SourceTypeSepaDebit.Builder.() -> Unit): SourceTypeSepaDebit = SourceTypeSepaDebit.build(block)
