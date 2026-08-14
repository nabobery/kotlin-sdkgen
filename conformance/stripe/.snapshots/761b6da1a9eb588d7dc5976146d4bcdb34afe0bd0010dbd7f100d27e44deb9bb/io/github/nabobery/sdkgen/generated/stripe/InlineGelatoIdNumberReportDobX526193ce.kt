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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineGelatoIdNumberReportDobX526193ceBranch {
  GelatoDataIdNumberReportDate,
}

public sealed class InlineGelatoIdNumberReportDobX526193ceDecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoIdNumberReportDobX526193ceNoMatchException(
  message: String,
) : InlineGelatoIdNumberReportDobX526193ceDecodingException(message)

internal data class InlineGelatoIdNumberReportDobX526193ceInspection(
  public val matchesGelatoDataIdNumberReportDate: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoDataIdNumberReportDate).count { it }
}

/**
 * Date of birth.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_id_number_report/properties/dob
 */
@Serializable(with = InlineGelatoIdNumberReportDobX526193ce.Serializer::class)
public class InlineGelatoIdNumberReportDobX526193ce internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoIdNumberReportDobX526193ceInspection,
) {
  public val gelatoDataIdNumberReportDate: GelatoDataIdNumberReportDateView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoDataIdNumberReportDate) json.decodeFromJsonElement<GelatoDataIdNumberReportDateView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoIdNumberReportDobX526193ceBranch>
    get() = buildSet {
      if (inspection.matchesGelatoDataIdNumberReportDate) add(InlineGelatoIdNumberReportDobX526193ceBranch.GelatoDataIdNumberReportDate)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoIdNumberReportDobX526193ce {
      val inspection = inspectInlineGelatoIdNumberReportDobX526193ce(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoIdNumberReportDobX526193ceNoMatchException("InlineGelatoIdNumberReportDobX526193ce matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoIdNumberReportDobX526193ce(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoIdNumberReportDobX526193ce> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoIdNumberReportDobX526193ce {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoIdNumberReportDobX526193ce")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoIdNumberReportDobX526193ce) {
      encoder.requireJsonEncoder("InlineGelatoIdNumberReportDobX526193ce").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoIdNumberReportDobX526193ce(element: JsonElement): InlineGelatoIdNumberReportDobX526193ceInspection {
  val raw = element as? JsonObject ?: return InlineGelatoIdNumberReportDobX526193ceInspection(
    matchesGelatoDataIdNumberReportDate = false,
    failures = listOf("GelatoDataIdNumberReportDate: expected JSON object"),
  )
  val matchesGelatoDataIdNumberReportDate = true
  return InlineGelatoIdNumberReportDobX526193ceInspection(
    matchesGelatoDataIdNumberReportDate = matchesGelatoDataIdNumberReportDate,
    failures = buildList {
      if (!matchesGelatoDataIdNumberReportDate) add("GelatoDataIdNumberReportDate: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
