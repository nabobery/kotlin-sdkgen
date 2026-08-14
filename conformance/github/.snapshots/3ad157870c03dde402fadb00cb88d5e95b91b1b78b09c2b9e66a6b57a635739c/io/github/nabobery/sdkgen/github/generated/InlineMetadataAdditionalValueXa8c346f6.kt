package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineMetadataAdditionalValueXa8c346f6Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineMetadataAdditionalValueXa8c346f6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMetadataAdditionalValueXa8c346f6NoMatchException(
  message: String,
) : InlineMetadataAdditionalValueXa8c346f6DecodingException(message)

internal data class InlineMetadataAdditionalValueXa8c346f6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/metadata/additionalProperties.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/metadata/additionalProperties
 */
@Serializable(with = InlineMetadataAdditionalValueXa8c346f6.Serializer::class)
public class InlineMetadataAdditionalValueXa8c346f6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMetadataAdditionalValueXa8c346f6Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Double>(raw) else null }

  public val branch3: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<Boolean>(raw) else null }

  public val matchedBranches: Set<InlineMetadataAdditionalValueXa8c346f6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineMetadataAdditionalValueXa8c346f6Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineMetadataAdditionalValueXa8c346f6Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineMetadataAdditionalValueXa8c346f6Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMetadataAdditionalValueXa8c346f6 {
      val inspection = inspectInlineMetadataAdditionalValueXa8c346f6(raw)
      if (inspection.matchCount == 0) {
        throw InlineMetadataAdditionalValueXa8c346f6NoMatchException("InlineMetadataAdditionalValueXa8c346f6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMetadataAdditionalValueXa8c346f6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMetadataAdditionalValueXa8c346f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMetadataAdditionalValueXa8c346f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMetadataAdditionalValueXa8c346f6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMetadataAdditionalValueXa8c346f6) {
      encoder.requireJsonEncoder("InlineMetadataAdditionalValueXa8c346f6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMetadataAdditionalValueXa8c346f6(element: JsonElement): InlineMetadataAdditionalValueXa8c346f6Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<Double>()
  val matchesBranch3 = element.isJsonDecodable<Boolean>()
  return InlineMetadataAdditionalValueXa8c346f6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match Double")
      if (!matchesBranch3) add("Branch3: value does not match Boolean")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
