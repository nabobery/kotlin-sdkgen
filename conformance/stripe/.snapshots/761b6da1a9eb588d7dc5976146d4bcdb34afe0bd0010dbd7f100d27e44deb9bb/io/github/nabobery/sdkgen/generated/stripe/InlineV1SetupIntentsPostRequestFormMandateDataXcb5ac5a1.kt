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

public enum class InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Branch {
  InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085,
  InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3,
}

public sealed class InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Inspection(
  public val matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085, matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3).count { it }
}

/**
 * This hash contains details about the mandate to create. This parameter can only be used with
 * [`confirm=true`](https://docs.stripe.com/api/setup_intents/create#create_setup_intent-confirm).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/mandate_data
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Inspection,
) {
  public val inlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085:
      InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3:
      InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3>(raw) else null }

  public val matchedBranches: Set<InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085) add(InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Branch.InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3) add(InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Branch.InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1NoMatchException("InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1(element: JsonElement): InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Inspection {
  val matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085>()
  val matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3 = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3>()
  return InlineV1SetupIntentsPostRequestFormMandateDataXcb5ac5a1Inspection(
    matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085 = matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085,
    matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3 = matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3,
    failures = buildList {
      if (!matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085) add("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085: value does not match InlineV1SetupIntentsPostRequestFormMandateDataAnyOf1X7529a085")
      if (!matchesInlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3) add("InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3: value does not match InlineV1SetupIntentsPostRequestFormMandateDataAnyOf2X3822ccc3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
