package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

public sealed class InlineOrgsPatchResponse422JsonXe06e6459DecodingException(
  message: String,
) : SerializationException(message)

public class InlineOrgsPatchResponse422JsonXe06e6459NoMatchException(
  message: String,
) : InlineOrgsPatchResponse422JsonXe06e6459DecodingException(message)

public class InlineOrgsPatchResponse422JsonXe06e6459AmbiguityException(
  message: String,
) : InlineOrgsPatchResponse422JsonXe06e6459DecodingException(message)

public class InlineOrgsPatchResponse422JsonXe06e6459BranchValidationException(
  message: String,
) : InlineOrgsPatchResponse422JsonXe06e6459DecodingException(message)

/**
 * Closed oneOf union for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}/patch/responses/422/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}/patch/responses/422/content/application~1json/schema
 */
@Serializable(with = InlineOrgsPatchResponse422JsonXe06e6459.Serializer::class)
public sealed interface InlineOrgsPatchResponse422JsonXe06e6459 {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class ValidationError internal constructor(
    public val documentationUrl: String,
    public val message: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOrgsPatchResponse422JsonXe06e6459 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(documentationUrl: String, message: String): ValidationError {
        val raw = buildJsonObject {
          put("documentation_url", documentationUrl)
          put("message", message)
        }
        val inspection = inspectInlineOrgsPatchResponse422JsonXe06e6459(raw)
        if (inspection.size == 0) {
          throw InlineOrgsPatchResponse422JsonXe06e6459NoMatchException("InlineOrgsPatchResponse422JsonXe06e6459 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.validationErrorMatches) {
          throw InlineOrgsPatchResponse422JsonXe06e6459BranchValidationException("ValidationError factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOrgsPatchResponse422JsonXe06e6459AmbiguityException("InlineOrgsPatchResponse422JsonXe06e6459 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ValidationError(
          documentationUrl = documentationUrl,
          message = message,
          raw = raw,
        )
      }
    }
  }

  public class ValidationErrorSimple internal constructor(
    public val documentationUrl: String,
    public val message: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineOrgsPatchResponse422JsonXe06e6459 {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(documentationUrl: String, message: String): ValidationErrorSimple {
        val raw = buildJsonObject {
          put("documentation_url", documentationUrl)
          put("message", message)
        }
        val inspection = inspectInlineOrgsPatchResponse422JsonXe06e6459(raw)
        if (inspection.size == 0) {
          throw InlineOrgsPatchResponse422JsonXe06e6459NoMatchException("InlineOrgsPatchResponse422JsonXe06e6459 matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.validationErrorSimpleMatches) {
          throw InlineOrgsPatchResponse422JsonXe06e6459BranchValidationException("ValidationErrorSimple factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineOrgsPatchResponse422JsonXe06e6459AmbiguityException("InlineOrgsPatchResponse422JsonXe06e6459 matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return ValidationErrorSimple(
          documentationUrl = documentationUrl,
          message = message,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineOrgsPatchResponse422JsonXe06e6459> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPatchResponse422JsonXe06e6459 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPatchResponse422JsonXe06e6459")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineOrgsPatchResponse422JsonXe06e6459NoMatchException("InlineOrgsPatchResponse422JsonXe06e6459 matched 0 branches: expected JSON object")
      val matches = inspectInlineOrgsPatchResponse422JsonXe06e6459(rawObject)
      if (matches.size == 0) {
        throw InlineOrgsPatchResponse422JsonXe06e6459NoMatchException("InlineOrgsPatchResponse422JsonXe06e6459 matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineOrgsPatchResponse422JsonXe06e6459AmbiguityException("InlineOrgsPatchResponse422JsonXe06e6459 matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.validationErrorMatches -> ValidationError(documentationUrl = requireNotNull(matches.documentationUrl), message = requireNotNull(matches.message), raw = rawObject)
        matches.validationErrorSimpleMatches -> ValidationErrorSimple(documentationUrl = requireNotNull(matches.documentationUrl), message = requireNotNull(matches.message), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPatchResponse422JsonXe06e6459) {
      encoder.requireJsonEncoder("InlineOrgsPatchResponse422JsonXe06e6459").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineOrgsPatchResponse422JsonXe06e6459Inspection(
  public val documentationUrl: String?,
  public val documentationUrlDecoded: Boolean,
  public val message: String?,
  public val messageDecoded: Boolean,
  public val validationErrorMatches: Boolean,
  public val validationErrorSimpleMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (validationErrorMatches) add("ValidationError")
      if (validationErrorSimpleMatches) add("ValidationErrorSimple")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineOrgsPatchResponse422JsonXe06e6459(rawObject: JsonObject): InlineOrgsPatchResponse422JsonXe06e6459Inspection {
  val documentationUrlResult = rawObject["documentation_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val documentationUrl = documentationUrlResult?.getOrNull()
  val documentationUrlDecoded = documentationUrlResult?.isSuccess == true
  val messageResult = rawObject["message"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val message = messageResult?.getOrNull()
  val messageDecoded = messageResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val validationErrorMatches = documentationUrlDecoded && messageDecoded
  val validationErrorSimpleMatches = documentationUrlDecoded && messageDecoded
  return InlineOrgsPatchResponse422JsonXe06e6459Inspection(
    documentationUrl = documentationUrl,
    documentationUrlDecoded = documentationUrlDecoded,
    message = message,
    messageDecoded = messageDecoded,
    validationErrorMatches = validationErrorMatches,
    validationErrorSimpleMatches = validationErrorSimpleMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!validationErrorMatches) add("ValidationError: branch predicate did not match properties 'documentation_url' and 'message'")
      if (!validationErrorSimpleMatches) add("ValidationErrorSimple: branch predicate did not match properties 'documentation_url' and 'message'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
