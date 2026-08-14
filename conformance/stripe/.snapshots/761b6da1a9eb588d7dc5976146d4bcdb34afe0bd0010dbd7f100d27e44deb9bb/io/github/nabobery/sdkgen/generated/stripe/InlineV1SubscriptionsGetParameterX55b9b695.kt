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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionsGetParameterX55b9b695Branch {
  InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c,
  Branch2,
}

public sealed class InlineV1SubscriptionsGetParameterX55b9b695DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsGetParameterX55b9b695NoMatchException(
  message: String,
) : InlineV1SubscriptionsGetParameterX55b9b695DecodingException(message)

internal data class InlineV1SubscriptionsGetParameterX55b9b695Inspection(
  public val matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/get/parameters/2/schema
 */
@Serializable(with = InlineV1SubscriptionsGetParameterX55b9b695.Serializer::class)
public class InlineV1SubscriptionsGetParameterX55b9b695 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsGetParameterX55b9b695Inspection,
) {
  public val inlineV1SubscriptionsGetParameterAnyOf1Xd468d51c:
      InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c) json.decodeFromJsonElement<InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsGetParameterX55b9b695Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c) add(InlineV1SubscriptionsGetParameterX55b9b695Branch.InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c)
      if (inspection.matchesBranch2) add(InlineV1SubscriptionsGetParameterX55b9b695Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsGetParameterX55b9b695 {
      val inspection = inspectInlineV1SubscriptionsGetParameterX55b9b695(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsGetParameterX55b9b695NoMatchException("InlineV1SubscriptionsGetParameterX55b9b695 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsGetParameterX55b9b695(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsGetParameterX55b9b695> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsGetParameterX55b9b695 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsGetParameterX55b9b695")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsGetParameterX55b9b695) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsGetParameterX55b9b695").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsGetParameterX55b9b695(element: JsonElement): InlineV1SubscriptionsGetParameterX55b9b695Inspection {
  val matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c = element.isJsonDecodable<InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SubscriptionsGetParameterX55b9b695Inspection(
    matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c = matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SubscriptionsGetParameterAnyOf1Xd468d51c) add("InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c: value does not match InlineV1SubscriptionsGetParameterAnyOf1Xd468d51c")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
