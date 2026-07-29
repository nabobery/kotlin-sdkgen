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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Branch {
  InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab,
  InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0,
}

public sealed class InlineV1AccountsPostRequestFormIndividualDobXf914b8b9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormIndividualDobXf914b8b9NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormIndividualDobXf914b8b9DecodingException(message)

internal data class InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Inspection(
  public val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab: Boolean,
  public val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab, matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/dob.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/individual/properties/dob
 */
@Serializable(with = InlineV1AccountsPostRequestFormIndividualDobXf914b8b9.Serializer::class)
public class InlineV1AccountsPostRequestFormIndividualDobXf914b8b9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Inspection,
) {
  public val inlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab:
      InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab>(raw) else null }

  public val inlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0:
      InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0>(raw) else null }

  public val matchedBranches: Set<InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab) add(InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Branch.InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab)
      if (inspection.matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0) add(InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Branch.InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormIndividualDobXf914b8b9 {
      val inspection = inspectInlineV1AccountsPostRequestFormIndividualDobXf914b8b9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormIndividualDobXf914b8b9NoMatchException("InlineV1AccountsPostRequestFormIndividualDobXf914b8b9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormIndividualDobXf914b8b9(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormIndividualDobXf914b8b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormIndividualDobXf914b8b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormIndividualDobXf914b8b9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormIndividualDobXf914b8b9) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormIndividualDobXf914b8b9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormIndividualDobXf914b8b9(element: JsonElement): InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Inspection {
  val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab = element.isJsonDecodable<InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab>()
  val matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0 = element.isJsonDecodable<InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0>()
  return InlineV1AccountsPostRequestFormIndividualDobXf914b8b9Inspection(
    matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab = matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab,
    matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0 = matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0,
    failures = buildList {
      if (!matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab) add("InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab: value does not match InlineV1AccountsPostRequestFormIndividualDobAnyOf1Xb16dedab")
      if (!matchesInlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0) add("InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0: value does not match InlineV1AccountsPostRequestFormIndividualDobAnyOf2X2b0a85b0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
