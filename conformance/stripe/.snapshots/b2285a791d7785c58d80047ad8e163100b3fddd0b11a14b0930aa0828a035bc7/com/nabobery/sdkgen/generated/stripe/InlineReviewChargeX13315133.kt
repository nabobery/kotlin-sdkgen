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

public enum class InlineReviewChargeX13315133Branch {
  Branch1,
  Charge,
}

public sealed class InlineReviewChargeX13315133DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReviewChargeX13315133NoMatchException(
  message: String,
) : InlineReviewChargeX13315133DecodingException(message)

internal data class InlineReviewChargeX13315133Inspection(
  public val matchesBranch1: Boolean,
  public val matchesCharge: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesCharge).count { it }
}

/**
 * The charge associated with this review.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/review/properties/charge
 */
@Serializable(with = InlineReviewChargeX13315133.Serializer::class)
public class InlineReviewChargeX13315133 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReviewChargeX13315133Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val charge: Charge? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCharge) json.decodeFromJsonElement<Charge>(raw) else null }

  public val matchedBranches: Set<InlineReviewChargeX13315133Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineReviewChargeX13315133Branch.Branch1)
      if (inspection.matchesCharge) add(InlineReviewChargeX13315133Branch.Charge)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReviewChargeX13315133 {
      val inspection = inspectInlineReviewChargeX13315133(raw)
      if (inspection.matchCount == 0) {
        throw InlineReviewChargeX13315133NoMatchException("InlineReviewChargeX13315133 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReviewChargeX13315133(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineReviewChargeX13315133> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReviewChargeX13315133 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReviewChargeX13315133")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReviewChargeX13315133) {
      encoder.requireJsonEncoder("InlineReviewChargeX13315133").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReviewChargeX13315133(element: JsonElement): InlineReviewChargeX13315133Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesCharge = element.isJsonDecodable<Charge>()
  return InlineReviewChargeX13315133Inspection(
    matchesBranch1 = matchesBranch1,
    matchesCharge = matchesCharge,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesCharge) add("Charge: value does not match Charge")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
