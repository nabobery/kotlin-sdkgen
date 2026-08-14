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

public enum class InlineV1PaymentIntentsGetParameterXb259e3efBranch {
  InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d,
  Branch2,
}

public sealed class InlineV1PaymentIntentsGetParameterXb259e3efDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsGetParameterXb259e3efNoMatchException(
  message: String,
) : InlineV1PaymentIntentsGetParameterXb259e3efDecodingException(message)

internal data class InlineV1PaymentIntentsGetParameterXb259e3efInspection(
  public val matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/get/parameters/0/schema
 */
@Serializable(with = InlineV1PaymentIntentsGetParameterXb259e3ef.Serializer::class)
public class InlineV1PaymentIntentsGetParameterXb259e3ef internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsGetParameterXb259e3efInspection,
) {
  public val inlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d:
      InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d) json.decodeFromJsonElement<InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentIntentsGetParameterXb259e3efBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d) add(InlineV1PaymentIntentsGetParameterXb259e3efBranch.InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d)
      if (inspection.matchesBranch2) add(InlineV1PaymentIntentsGetParameterXb259e3efBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsGetParameterXb259e3ef {
      val inspection = inspectInlineV1PaymentIntentsGetParameterXb259e3ef(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsGetParameterXb259e3efNoMatchException("InlineV1PaymentIntentsGetParameterXb259e3ef matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsGetParameterXb259e3ef(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsGetParameterXb259e3ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsGetParameterXb259e3ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsGetParameterXb259e3ef")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsGetParameterXb259e3ef) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsGetParameterXb259e3ef").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsGetParameterXb259e3ef(element: JsonElement): InlineV1PaymentIntentsGetParameterXb259e3efInspection {
  val matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d = element.isJsonDecodable<InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1PaymentIntentsGetParameterXb259e3efInspection(
    matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d = matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d) add("InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d: value does not match InlineV1PaymentIntentsGetParameterAnyOf1Xda0bfe8d")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
