package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePredictionContentX288f9ad7Branch {
  Branch1,
  Branch2,
}

public sealed class InlinePredictionContentX288f9ad7DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePredictionContentX288f9ad7NoMatchException(
  message: String,
) : InlinePredictionContentX288f9ad7DecodingException(message)

internal data class InlinePredictionContentX288f9ad7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/Prediction/properties/content.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Prediction/properties/content
 */
@Serializable(with = InlinePredictionContentX288f9ad7.Serializer::class)
public class InlinePredictionContentX288f9ad7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePredictionContentX288f9ad7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<PredictionContentText>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<PredictionContentText>>(raw) else null }

  public val matchedBranches: Set<InlinePredictionContentX288f9ad7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePredictionContentX288f9ad7Branch.Branch1)
      if (inspection.matchesBranch2) add(InlinePredictionContentX288f9ad7Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePredictionContentX288f9ad7 {
      val inspection = inspectInlinePredictionContentX288f9ad7(raw)
      if (inspection.matchCount == 0) {
        throw InlinePredictionContentX288f9ad7NoMatchException("InlinePredictionContentX288f9ad7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePredictionContentX288f9ad7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePredictionContentX288f9ad7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePredictionContentX288f9ad7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePredictionContentX288f9ad7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePredictionContentX288f9ad7) {
      encoder.requireJsonEncoder("InlinePredictionContentX288f9ad7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePredictionContentX288f9ad7(element: JsonElement): InlinePredictionContentX288f9ad7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<PredictionContentText>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlinePredictionContentX288f9ad7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
