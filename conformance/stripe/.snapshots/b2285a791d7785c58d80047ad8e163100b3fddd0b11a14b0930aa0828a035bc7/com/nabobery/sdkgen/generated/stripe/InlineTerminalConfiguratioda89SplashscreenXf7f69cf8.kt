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

public enum class InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Branch {
  Branch1,
  File,
}

public sealed class InlineTerminalConfiguratioda89SplashscreenXf7f69cf8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineTerminalConfiguratioda89SplashscreenXf7f69cf8NoMatchException(
  message: String,
) : InlineTerminalConfiguratioda89SplashscreenXf7f69cf8DecodingException(message)

internal data class InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesFile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesFile).count { it }
}

/**
 * A File ID representing an image to display on the reader
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_device_type_specific_c
 * onfig/properties/splashscreen
 */
@Serializable(with = InlineTerminalConfiguratioda89SplashscreenXf7f69cf8.Serializer::class)
public class InlineTerminalConfiguratioda89SplashscreenXf7f69cf8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val `file`: File? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesFile) json.decodeFromJsonElement<File>(raw) else null }

  public val matchedBranches: Set<InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Branch.Branch1)
      if (inspection.matchesFile) add(InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Branch.File)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTerminalConfiguratioda89SplashscreenXf7f69cf8 {
      val inspection = inspectInlineTerminalConfiguratioda89SplashscreenXf7f69cf8(raw)
      if (inspection.matchCount == 0) {
        throw InlineTerminalConfiguratioda89SplashscreenXf7f69cf8NoMatchException("InlineTerminalConfiguratioda89SplashscreenXf7f69cf8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTerminalConfiguratioda89SplashscreenXf7f69cf8(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineTerminalConfiguratioda89SplashscreenXf7f69cf8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTerminalConfiguratioda89SplashscreenXf7f69cf8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTerminalConfiguratioda89SplashscreenXf7f69cf8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTerminalConfiguratioda89SplashscreenXf7f69cf8) {
      encoder.requireJsonEncoder("InlineTerminalConfiguratioda89SplashscreenXf7f69cf8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTerminalConfiguratioda89SplashscreenXf7f69cf8(element: JsonElement): InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesFile = element.isJsonDecodable<File>()
  return InlineTerminalConfiguratioda89SplashscreenXf7f69cf8Inspection(
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
