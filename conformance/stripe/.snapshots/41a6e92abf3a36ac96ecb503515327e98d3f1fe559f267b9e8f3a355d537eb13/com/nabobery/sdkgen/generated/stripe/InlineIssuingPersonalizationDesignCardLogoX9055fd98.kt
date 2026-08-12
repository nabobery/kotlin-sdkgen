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

public enum class InlineIssuingPersonalizationDesignCardLogoX9055fd98Branch {
  Branch1,
  File,
}

public sealed class InlineIssuingPersonalizationDesignCardLogoX9055fd98DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingPersonalizationDesignCardLogoX9055fd98NoMatchException(
  message: String,
) : InlineIssuingPersonalizationDesignCardLogoX9055fd98DecodingException(message)

internal data class InlineIssuingPersonalizationDesignCardLogoX9055fd98Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * The file for the card logo to use with physical bundles that support card logos. Must have a `purpose` value of
 * `issuing_logo`. Image must be in PNG format with dimensions of 1000px by 200px. It must be a binary (black and white)
 * image containing a black logo on a white background. We don't accept grayscale.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.personalization_design/properties/card_logo
 */
@Serializable(with = InlineIssuingPersonalizationDesignCardLogoX9055fd98.Serializer::class)
public class InlineIssuingPersonalizationDesignCardLogoX9055fd98 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingPersonalizationDesignCardLogoX9055fd98Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineIssuingPersonalizationDesignCardLogoX9055fd98Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingPersonalizationDesignCardLogoX9055fd98Branch.Branch1)
      if (inspection.matchesFile) add(InlineIssuingPersonalizationDesignCardLogoX9055fd98Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingPersonalizationDesignCardLogoX9055fd98 {
      val inspection = inspectInlineIssuingPersonalizationDesignCardLogoX9055fd98(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingPersonalizationDesignCardLogoX9055fd98NoMatchException("InlineIssuingPersonalizationDesignCardLogoX9055fd98 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingPersonalizationDesignCardLogoX9055fd98(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingPersonalizationDesignCardLogoX9055fd98> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingPersonalizationDesignCardLogoX9055fd98 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingPersonalizationDesignCardLogoX9055fd98")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingPersonalizationDesignCardLogoX9055fd98) {
      encoder.requireJsonEncoder("InlineIssuingPersonalizationDesignCardLogoX9055fd98").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingPersonalizationDesignCardLogoX9055fd98(element: JsonElement): InlineIssuingPersonalizationDesignCardLogoX9055fd98Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineIssuingPersonalizationDesignCardLogoX9055fd98Inspection(
    matchesBranch1 = matchesBranch1,
    matchesFile = matchesFile,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesFile) add("File: value does not match File")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
