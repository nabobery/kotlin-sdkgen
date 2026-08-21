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

public enum class InlineAccountBrandingSettingsLogoX1ec3b721Branch {
  Branch1,
  File,
}

public sealed class InlineAccountBrandingSettingsLogoX1ec3b721DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountBrandingSettingsLogoX1ec3b721NoMatchException(
  message: String,
) : InlineAccountBrandingSettingsLogoX1ec3b721DecodingException(message)

internal data class InlineAccountBrandingSettingsLogoX1ec3b721Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * (ID of a [file upload](https://stripe.com/docs/guides/file-upload)) A logo for the account that will be used in
 * Checkout instead of the icon and without the account's name next to it if provided. Must be at least 128px x 128px.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_branding_settings/properties/logo
 */
@Serializable(with = InlineAccountBrandingSettingsLogoX1ec3b721.Serializer::class)
public class InlineAccountBrandingSettingsLogoX1ec3b721 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountBrandingSettingsLogoX1ec3b721Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineAccountBrandingSettingsLogoX1ec3b721Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineAccountBrandingSettingsLogoX1ec3b721Branch.Branch1)
      if (inspection.matchesFile) add(InlineAccountBrandingSettingsLogoX1ec3b721Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountBrandingSettingsLogoX1ec3b721 {
      val inspection = inspectInlineAccountBrandingSettingsLogoX1ec3b721(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountBrandingSettingsLogoX1ec3b721NoMatchException("InlineAccountBrandingSettingsLogoX1ec3b721 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountBrandingSettingsLogoX1ec3b721(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAccountBrandingSettingsLogoX1ec3b721> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountBrandingSettingsLogoX1ec3b721 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountBrandingSettingsLogoX1ec3b721")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountBrandingSettingsLogoX1ec3b721) {
      encoder.requireJsonEncoder("InlineAccountBrandingSettingsLogoX1ec3b721").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountBrandingSettingsLogoX1ec3b721(element: JsonElement): InlineAccountBrandingSettingsLogoX1ec3b721Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineAccountBrandingSettingsLogoX1ec3b721Inspection(
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
