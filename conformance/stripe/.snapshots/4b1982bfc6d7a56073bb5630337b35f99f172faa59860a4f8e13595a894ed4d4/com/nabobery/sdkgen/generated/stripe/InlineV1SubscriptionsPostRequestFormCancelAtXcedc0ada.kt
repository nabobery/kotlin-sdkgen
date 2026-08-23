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

public enum class InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478,
  InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1,
}

public sealed class InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478, matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1).count { it }
}

/**
 * A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause
 * a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will
 * always cause a proration for that period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/cancel_at
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478:
      InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1:
      InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478) add(InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaBranch.InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1) add(InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaBranch.InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaNoMatchException("InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormCancelAtXcedc0ada(element: JsonElement): InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478>()
  val matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1 = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1>()
  return InlineV1SubscriptionsPostRequestFormCancelAtXcedc0adaInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478 = matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478,
    matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1 = matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478) add("InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478: value does not match InlineV1SubscriptionsPostRequestFormCancelAtAnyOf2X036e9478")
      if (!matchesInlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1) add("InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1: value does not match InlineV1SubscriptionsPostRequestFormCancelAtAnyOf3X5d3ea8a1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
