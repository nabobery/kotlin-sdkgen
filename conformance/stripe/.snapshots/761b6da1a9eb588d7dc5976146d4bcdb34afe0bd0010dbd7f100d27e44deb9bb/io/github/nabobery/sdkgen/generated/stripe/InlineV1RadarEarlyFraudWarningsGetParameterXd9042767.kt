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

public enum class InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Branch {
  InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b,
  Branch2,
}

public sealed class InlineV1RadarEarlyFraudWarningsGetParameterXd9042767DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1RadarEarlyFraudWarningsGetParameterXd9042767NoMatchException(
  message: String,
) : InlineV1RadarEarlyFraudWarningsGetParameterXd9042767DecodingException(message)

internal data class InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Inspection(
  public val matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1radar~1early_fraud_warnings/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1radar~1early_fraud_warnings/get/parameters/1/schema
 */
@Serializable(with = InlineV1RadarEarlyFraudWarningsGetParameterXd9042767.Serializer::class)
public class InlineV1RadarEarlyFraudWarningsGetParameterXd9042767 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Inspection,
) {
  public val inlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b:
      InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b) json.decodeFromJsonElement<InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b) add(InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Branch.InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b)
      if (inspection.matchesBranch2) add(InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1RadarEarlyFraudWarningsGetParameterXd9042767 {
      val inspection = inspectInlineV1RadarEarlyFraudWarningsGetParameterXd9042767(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1RadarEarlyFraudWarningsGetParameterXd9042767NoMatchException("InlineV1RadarEarlyFraudWarningsGetParameterXd9042767 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1RadarEarlyFraudWarningsGetParameterXd9042767(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1RadarEarlyFraudWarningsGetParameterXd9042767> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarEarlyFraudWarningsGetParameterXd9042767 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarEarlyFraudWarningsGetParameterXd9042767")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarEarlyFraudWarningsGetParameterXd9042767) {
      encoder.requireJsonEncoder("InlineV1RadarEarlyFraudWarningsGetParameterXd9042767").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1RadarEarlyFraudWarningsGetParameterXd9042767(element: JsonElement): InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Inspection {
  val matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b = element.isJsonDecodable<InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1RadarEarlyFraudWarningsGetParameterXd9042767Inspection(
    matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b = matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b) add("InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b: value does not match InlineV1RadarEarlyFraudWarningsGetParameterAnyOf1X47c71b1b")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
