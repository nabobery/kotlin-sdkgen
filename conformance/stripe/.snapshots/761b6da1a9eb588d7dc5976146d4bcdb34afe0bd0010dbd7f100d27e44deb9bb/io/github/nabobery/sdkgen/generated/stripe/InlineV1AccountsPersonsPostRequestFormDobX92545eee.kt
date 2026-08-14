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

public enum class InlineV1AccountsPersonsPostRequestFormDobX92545eeeBranch {
  InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171,
  InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe,
}

public sealed class InlineV1AccountsPersonsPostRequestFormDobX92545eeeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormDobX92545eeeNoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormDobX92545eeeDecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormDobX92545eeeInspection(
  public val matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171, matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe).count { it }
}

/**
 * The person's date of birth.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/dob
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormDobX92545eee.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormDobX92545eee internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPersonsPostRequestFormDobX92545eeeInspection,
) {
  public val inlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171:
      InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe:
      InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe>(raw) else null }

  public val matchedBranches: Set<InlineV1AccountsPersonsPostRequestFormDobX92545eeeBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171) add(InlineV1AccountsPersonsPostRequestFormDobX92545eeeBranch.InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe) add(InlineV1AccountsPersonsPostRequestFormDobX92545eeeBranch.InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormDobX92545eee {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormDobX92545eee(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormDobX92545eeeNoMatchException("InlineV1AccountsPersonsPostRequestFormDobX92545eee matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormDobX92545eee(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormDobX92545eee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormDobX92545eee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormDobX92545eee")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormDobX92545eee) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormDobX92545eee").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormDobX92545eee(element: JsonElement): InlineV1AccountsPersonsPostRequestFormDobX92545eeeInspection {
  val matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171>()
  val matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe>()
  return InlineV1AccountsPersonsPostRequestFormDobX92545eeeInspection(
    matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171 = matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171,
    matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe = matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe,
    failures = buildList {
      if (!matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171) add("InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171: value does not match InlineV1AccountsPersonsPostRequestFormDobAnyOf1X41202171")
      if (!matchesInlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe) add("InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe: value does not match InlineV1AccountsPersonsPostRequestFormDobAnyOf2X5a6c2dfe")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
