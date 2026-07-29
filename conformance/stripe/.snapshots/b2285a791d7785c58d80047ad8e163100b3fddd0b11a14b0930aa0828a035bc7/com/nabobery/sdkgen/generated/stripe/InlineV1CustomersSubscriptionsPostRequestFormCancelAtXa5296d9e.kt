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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf,
  InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf, matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c).count { it }
}

/**
 * A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause
 * a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will
 * always cause a proration for that period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/cancel_at
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf:
      InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c:
      InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf) add(InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eBranch.InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c) add(InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eBranch.InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9e(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c>()
  return InlineV1CustomersSubscriptionsPostRequestFormCancelAtXa5296d9eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf = matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf,
    matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c = matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf) add("InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf: value does not match InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xf57050cf")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c) add("InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c: value does not match InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf3X59471a1c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
