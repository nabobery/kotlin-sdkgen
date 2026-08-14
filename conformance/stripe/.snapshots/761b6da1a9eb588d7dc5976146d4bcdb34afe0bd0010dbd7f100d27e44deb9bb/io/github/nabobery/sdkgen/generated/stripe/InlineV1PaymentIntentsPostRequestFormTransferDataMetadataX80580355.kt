package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6,
}

public sealed class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data/properties/metadata
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6:
      InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6) add(InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Branch.InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355NoMatchException("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355(element: JsonElement): InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6>()
  return InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX80580355Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6 = matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6) add("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6: value does not match InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xff564ca6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
