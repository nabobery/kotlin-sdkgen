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

public enum class InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cBranch {
  Branch1,
  InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f,
}

public sealed class InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cNoMatchException(
  message: String,
) : InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cDecodingException(message)

internal data class InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1refunds/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c.Serializer::class)
public class InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f:
      InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f) json.decodeFromJsonElement<InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f>(raw) else null }

  public val matchedBranches: Set<InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cBranch.Branch1)
      if (inspection.matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f) add(InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cBranch.InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c {
      val inspection = inspectInlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cNoMatchException("InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c) {
      encoder.requireJsonEncoder("InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ChargesRefundsPostRequestFormMetadataX2be9a45c(element: JsonElement): InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f = element.isJsonDecodable<InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f>()
  return InlineV1ChargesRefundsPostRequestFormMetadataX2be9a45cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f = matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f) add("InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f: value does not match InlineV1ChargesRefundsPostRequestFormMetadataAnyOf2Xb720c67f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
