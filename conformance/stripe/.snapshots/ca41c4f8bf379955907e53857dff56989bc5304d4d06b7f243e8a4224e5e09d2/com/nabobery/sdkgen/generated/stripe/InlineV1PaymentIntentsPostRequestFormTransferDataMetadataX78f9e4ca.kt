package com.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468,
}

public sealed class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data/properties/metadata
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468:
      InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468) add(InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caBranch.InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caNoMatchException("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4ca(element: JsonElement): InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468>()
  return InlineV1PaymentIntentsPostRequestFormTransferDataMetadataX78f9e4caInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468 = matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468) add("InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468: value does not match InlineV1PaymentIntentsPostRequestFormTransferDataMetadataAnyOf2Xbb048468")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
