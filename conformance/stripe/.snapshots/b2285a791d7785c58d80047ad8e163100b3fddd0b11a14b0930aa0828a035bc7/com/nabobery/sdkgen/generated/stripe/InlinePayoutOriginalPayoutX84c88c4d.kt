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

public enum class InlinePayoutOriginalPayoutX84c88c4dBranch {
  Branch1,
  Payout,
}

public sealed class InlinePayoutOriginalPayoutX84c88c4dDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePayoutOriginalPayoutX84c88c4dNoMatchException(
  message: String,
) : InlinePayoutOriginalPayoutX84c88c4dDecodingException(message)

internal data class InlinePayoutOriginalPayoutX84c88c4dInspection(
  public val matchesBranch1: Boolean,
  public val matchesPayout: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPayout).count { it }
}

/**
 * If the payout reverses another, this is the ID of the original payout.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payout/properties/original_payout
 */
@Serializable(with = InlinePayoutOriginalPayoutX84c88c4d.Serializer::class)
public class InlinePayoutOriginalPayoutX84c88c4d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePayoutOriginalPayoutX84c88c4dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val payout: Payout? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPayout) json.decodeFromJsonElement<Payout>(raw) else null }

  public val matchedBranches: Set<InlinePayoutOriginalPayoutX84c88c4dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePayoutOriginalPayoutX84c88c4dBranch.Branch1)
      if (inspection.matchesPayout) add(InlinePayoutOriginalPayoutX84c88c4dBranch.Payout)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePayoutOriginalPayoutX84c88c4d {
      val inspection = inspectInlinePayoutOriginalPayoutX84c88c4d(raw)
      if (inspection.matchCount == 0) {
        throw InlinePayoutOriginalPayoutX84c88c4dNoMatchException("InlinePayoutOriginalPayoutX84c88c4d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePayoutOriginalPayoutX84c88c4d(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePayoutOriginalPayoutX84c88c4d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePayoutOriginalPayoutX84c88c4d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePayoutOriginalPayoutX84c88c4d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePayoutOriginalPayoutX84c88c4d) {
      encoder.requireJsonEncoder("InlinePayoutOriginalPayoutX84c88c4d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePayoutOriginalPayoutX84c88c4d(element: JsonElement): InlinePayoutOriginalPayoutX84c88c4dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPayout = element.isJsonDecodable<Payout>()
  return InlinePayoutOriginalPayoutX84c88c4dInspection(
    matchesBranch1 = matchesBranch1,
    matchesPayout = matchesPayout,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPayout) add("Payout: value does not match Payout")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
