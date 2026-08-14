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

public enum class InlineGelatoEmailReportErrorXf7cb69a6Branch {
  GelatoEmailReportError,
}

public sealed class InlineGelatoEmailReportErrorXf7cb69a6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineGelatoEmailReportErrorXf7cb69a6NoMatchException(
  message: String,
) : InlineGelatoEmailReportErrorXf7cb69a6DecodingException(message)

internal data class InlineGelatoEmailReportErrorXf7cb69a6Inspection(
  public val matchesGelatoEmailReportError: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesGelatoEmailReportError).count { it }
}

/**
 * Details on the verification error. Present when status is `unverified`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_email_report/properties/error
 */
@Serializable(with = InlineGelatoEmailReportErrorXf7cb69a6.Serializer::class)
public class InlineGelatoEmailReportErrorXf7cb69a6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineGelatoEmailReportErrorXf7cb69a6Inspection,
) {
  public val gelatoEmailReportError: GelatoEmailReportErrorView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesGelatoEmailReportError) json.decodeFromJsonElement<GelatoEmailReportErrorView>(raw) else null }

  public val matchedBranches: Set<InlineGelatoEmailReportErrorXf7cb69a6Branch>
    get() = buildSet {
      if (inspection.matchesGelatoEmailReportError) add(InlineGelatoEmailReportErrorXf7cb69a6Branch.GelatoEmailReportError)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineGelatoEmailReportErrorXf7cb69a6 {
      val inspection = inspectInlineGelatoEmailReportErrorXf7cb69a6(raw)
      if (inspection.matchCount == 0) {
        throw InlineGelatoEmailReportErrorXf7cb69a6NoMatchException("InlineGelatoEmailReportErrorXf7cb69a6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineGelatoEmailReportErrorXf7cb69a6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineGelatoEmailReportErrorXf7cb69a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGelatoEmailReportErrorXf7cb69a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGelatoEmailReportErrorXf7cb69a6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineGelatoEmailReportErrorXf7cb69a6) {
      encoder.requireJsonEncoder("InlineGelatoEmailReportErrorXf7cb69a6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineGelatoEmailReportErrorXf7cb69a6(element: JsonElement): InlineGelatoEmailReportErrorXf7cb69a6Inspection {
  val raw = element as? JsonObject ?: return InlineGelatoEmailReportErrorXf7cb69a6Inspection(
    matchesGelatoEmailReportError = false,
    failures = listOf("GelatoEmailReportError: expected JSON object"),
  )
  val matchesGelatoEmailReportError = true
  return InlineGelatoEmailReportErrorXf7cb69a6Inspection(
    matchesGelatoEmailReportError = matchesGelatoEmailReportError,
    failures = buildList {
      if (!matchesGelatoEmailReportError) add("GelatoEmailReportError: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
