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

public enum class InlinePersonUsCfpbDataX411ab524Branch {
  PersonUsCfpbData,
}

public sealed class InlinePersonUsCfpbDataX411ab524DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePersonUsCfpbDataX411ab524NoMatchException(
  message: String,
) : InlinePersonUsCfpbDataX411ab524DecodingException(message)

internal data class InlinePersonUsCfpbDataX411ab524Inspection(
  public val matchesPersonUsCfpbData: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPersonUsCfpbData).count { it }
}

/**
 * Demographic data related to the person.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/person/properties/us_cfpb_data
 */
@Serializable(with = InlinePersonUsCfpbDataX411ab524.Serializer::class)
public class InlinePersonUsCfpbDataX411ab524 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePersonUsCfpbDataX411ab524Inspection,
) {
  public val personUsCfpbData: PersonUsCfpbDataView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPersonUsCfpbData) json.decodeFromJsonElement<PersonUsCfpbDataView>(raw) else null }

  public val matchedBranches: Set<InlinePersonUsCfpbDataX411ab524Branch>
    get() = buildSet {
      if (inspection.matchesPersonUsCfpbData) add(InlinePersonUsCfpbDataX411ab524Branch.PersonUsCfpbData)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePersonUsCfpbDataX411ab524 {
      val inspection = inspectInlinePersonUsCfpbDataX411ab524(raw)
      if (inspection.matchCount == 0) {
        throw InlinePersonUsCfpbDataX411ab524NoMatchException("InlinePersonUsCfpbDataX411ab524 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePersonUsCfpbDataX411ab524(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePersonUsCfpbDataX411ab524> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePersonUsCfpbDataX411ab524 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePersonUsCfpbDataX411ab524")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePersonUsCfpbDataX411ab524) {
      encoder.requireJsonEncoder("InlinePersonUsCfpbDataX411ab524").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePersonUsCfpbDataX411ab524(element: JsonElement): InlinePersonUsCfpbDataX411ab524Inspection {
  val raw = element as? JsonObject ?: return InlinePersonUsCfpbDataX411ab524Inspection(
    matchesPersonUsCfpbData = false,
    failures = listOf("PersonUsCfpbData: expected JSON object"),
  )
  val matchesPersonUsCfpbData = true
  return InlinePersonUsCfpbDataX411ab524Inspection(
    matchesPersonUsCfpbData = matchesPersonUsCfpbData,
    failures = buildList {
      if (!matchesPersonUsCfpbData) add("PersonUsCfpbData: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
