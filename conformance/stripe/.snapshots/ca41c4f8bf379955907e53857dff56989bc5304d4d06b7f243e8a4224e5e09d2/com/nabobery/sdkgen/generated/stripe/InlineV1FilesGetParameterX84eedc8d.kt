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

public enum class InlineV1FilesGetParameterX84eedc8dBranch {
  InlineV1FilesGetParameterAnyOf1X2b9c5e02,
  Branch2,
}

public sealed class InlineV1FilesGetParameterX84eedc8dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1FilesGetParameterX84eedc8dNoMatchException(
  message: String,
) : InlineV1FilesGetParameterX84eedc8dDecodingException(message)

internal data class InlineV1FilesGetParameterX84eedc8dInspection(
  public val matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1files/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1files/get/parameters/0/schema
 */
@Serializable(with = InlineV1FilesGetParameterX84eedc8d.Serializer::class)
public class InlineV1FilesGetParameterX84eedc8d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1FilesGetParameterX84eedc8dInspection,
) {
  public val inlineV1FilesGetParameterAnyOf1X2b9c5e02: InlineV1FilesGetParameterAnyOf1X2b9c5e02? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02) json.decodeFromJsonElement<InlineV1FilesGetParameterAnyOf1X2b9c5e02>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1FilesGetParameterX84eedc8dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02) add(InlineV1FilesGetParameterX84eedc8dBranch.InlineV1FilesGetParameterAnyOf1X2b9c5e02)
      if (inspection.matchesBranch2) add(InlineV1FilesGetParameterX84eedc8dBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1FilesGetParameterX84eedc8d {
      val inspection = inspectInlineV1FilesGetParameterX84eedc8d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1FilesGetParameterX84eedc8dNoMatchException("InlineV1FilesGetParameterX84eedc8d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1FilesGetParameterX84eedc8d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1FilesGetParameterX84eedc8d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FilesGetParameterX84eedc8d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FilesGetParameterX84eedc8d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FilesGetParameterX84eedc8d) {
      encoder.requireJsonEncoder("InlineV1FilesGetParameterX84eedc8d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1FilesGetParameterX84eedc8d(element: JsonElement): InlineV1FilesGetParameterX84eedc8dInspection {
  val matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02 = element.isJsonDecodable<InlineV1FilesGetParameterAnyOf1X2b9c5e02>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1FilesGetParameterX84eedc8dInspection(
    matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02 = matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1FilesGetParameterAnyOf1X2b9c5e02) add("InlineV1FilesGetParameterAnyOf1X2b9c5e02: value does not match InlineV1FilesGetParameterAnyOf1X2b9c5e02")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
