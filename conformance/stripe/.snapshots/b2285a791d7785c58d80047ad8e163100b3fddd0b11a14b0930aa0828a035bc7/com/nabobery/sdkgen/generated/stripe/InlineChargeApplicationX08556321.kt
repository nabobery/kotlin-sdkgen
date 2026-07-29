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

public enum class InlineChargeApplicationX08556321Branch {
  Branch1,
  Application,
}

public sealed class InlineChargeApplicationX08556321DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeApplicationX08556321NoMatchException(
  message: String,
) : InlineChargeApplicationX08556321DecodingException(message)

internal data class InlineChargeApplicationX08556321Inspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication).count { it }
}

/**
 * ID of the Connect application that created the charge.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/application
 */
@Serializable(with = InlineChargeApplicationX08556321.Serializer::class)
public class InlineChargeApplicationX08556321 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeApplicationX08556321Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val matchedBranches: Set<InlineChargeApplicationX08556321Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeApplicationX08556321Branch.Branch1)
      if (inspection.matchesApplication) add(InlineChargeApplicationX08556321Branch.Application)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeApplicationX08556321 {
      val inspection = inspectInlineChargeApplicationX08556321(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeApplicationX08556321NoMatchException("InlineChargeApplicationX08556321 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeApplicationX08556321(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineChargeApplicationX08556321> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeApplicationX08556321 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeApplicationX08556321")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeApplicationX08556321) {
      encoder.requireJsonEncoder("InlineChargeApplicationX08556321").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeApplicationX08556321(element: JsonElement): InlineChargeApplicationX08556321Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  return InlineChargeApplicationX08556321Inspection(
    matchesBranch1 = matchesBranch1,
    matchesApplication = matchesApplication,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesApplication) add("Application: value does not match Application")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
