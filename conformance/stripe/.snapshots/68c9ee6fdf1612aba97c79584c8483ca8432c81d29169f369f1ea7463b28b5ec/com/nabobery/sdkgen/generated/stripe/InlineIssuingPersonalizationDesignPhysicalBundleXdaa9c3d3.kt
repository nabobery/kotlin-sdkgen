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

public enum class InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Branch {
  Branch1,
  IssuingPhysicalBundle,
}

public sealed class InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3NoMatchException(
  message: String,
) : InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3DecodingException(message)

internal data class InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingPhysicalBundle: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingPhysicalBundle).count { it }
}

/**
 * The physical bundle object belonging to this personalization design.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.personalization_design/properties/physical_bundle
 */
@Serializable(with = InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3.Serializer::class)
public class InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingPhysicalBundle: IssuingPhysicalBundle? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingPhysicalBundle) json.decodeFromJsonElement<IssuingPhysicalBundle>(raw) else null }

  public val matchedBranches: Set<InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Branch.Branch1)
      if (inspection.matchesIssuingPhysicalBundle) add(InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Branch.IssuingPhysicalBundle)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3 {
      val inspection = inspectInlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3NoMatchException("InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3) {
      encoder.requireJsonEncoder("InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3(element: JsonElement): InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingPhysicalBundle = element.isJsonDecodable<IssuingPhysicalBundle>()
  return InlineIssuingPersonalizationDesignPhysicalBundleXdaa9c3d3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingPhysicalBundle = matchesIssuingPhysicalBundle,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingPhysicalBundle) add("IssuingPhysicalBundle: value does not match IssuingPhysicalBundle")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
