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

public enum class InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eBranch {
  InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2,
  InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca,
}

public sealed class InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eNoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eDecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eInspection(
  public val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2, matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca).count { it }
}

/**
 * The person's date of birth.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/dob
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eInspection,
) {
  public val inlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2:
      InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca:
      InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca>(raw) else null }

  public val matchedBranches: Set<InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2) add(InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eBranch.InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca) add(InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eBranch.InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormDobX0b84cc8e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eNoMatchException("InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDobX0b84cc8e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormDobX0b84cc8e(element: JsonElement): InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eInspection {
  val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2 = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2>()
  val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca>()
  return InlineV1AccountsPeoplePostRequestFormDobX0b84cc8eInspection(
    matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2 = matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2,
    matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca = matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca,
    failures = buildList {
      if (!matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2) add("InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2: value does not match InlineV1AccountsPeoplePostRequestFormDobAnyOf1Xfb635ae2")
      if (!matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca) add("InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca: value does not match InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xb3a12dca")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
