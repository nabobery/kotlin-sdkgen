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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class InlineWebhookProjectsV2ItemEditedChangesX8159b23cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineWebhookProjectsV2ItemEditedChangesX8159b23cNoMatchException(
  message: String,
) : InlineWebhookProjectsV2ItemEditedChangesX8159b23cDecodingException(message)

public class InlineWebhookProjectsV2ItemEditedChangesX8159b23cAmbiguityException(
  message: String,
) : InlineWebhookProjectsV2ItemEditedChangesX8159b23cDecodingException(message)

public class InlineWebhookProjectsV2ItemEditedChangesX8159b23cBranchValidationException(
  message: String,
) : InlineWebhookProjectsV2ItemEditedChangesX8159b23cDecodingException(message)

/**
 * The changes made to the item may involve modifications in the item's fields and draft issue body.
 * It includes altered values for text, number, date, single select, and iteration fields, along with the GraphQL node
 * ID of the changed field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes
 */
@Serializable(with = InlineWebhookProjectsV2ItemEditedChangesX8159b23c.Serializer::class)
public sealed interface InlineWebhookProjectsV2ItemEditedChangesX8159b23c {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 internal constructor(
    public val fieldValue: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineWebhookProjectsV2ItemEditedChangesX8159b23c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(fieldValue: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d): InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 {
        val raw = buildJsonObject {
              put("field_value", SdkJson.encodeToJsonElement(fieldValue))
            }
        val inspection = inspectInlineWebhookProjectsV2ItemEditedChangesX8159b23c(raw)
        if (inspection.size == 0) {
          throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cNoMatchException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches) {
          throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cBranchValidationException("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cAmbiguityException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79(
          fieldValue = fieldValue,
          raw = raw,
        )
      }
    }
  }

  public class InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 internal constructor(
    public val body: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : InlineWebhookProjectsV2ItemEditedChangesX8159b23c {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(body: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db): InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 {
        val raw = buildJsonObject {
              put("body", SdkJson.encodeToJsonElement(body))
            }
        val inspection = inspectInlineWebhookProjectsV2ItemEditedChangesX8159b23c(raw)
        if (inspection.size == 0) {
          throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cNoMatchException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches) {
          throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cBranchValidationException("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227 factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cAmbiguityException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227(
          body = body,
          raw = raw,
        )
      }
    }
  }

  public object Serializer : KSerializer<InlineWebhookProjectsV2ItemEditedChangesX8159b23c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemEditedChangesX8159b23c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemEditedChangesX8159b23c")
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cNoMatchException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched 0 branches: expected JSON object")
      val matches = inspectInlineWebhookProjectsV2ItemEditedChangesX8159b23c(rawObject)
      if (matches.size == 0) {
        throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cNoMatchException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched 0 branches: " + matches.failures.joinToString("; "))
      }
      if (matches.size > 1) {
        throw InlineWebhookProjectsV2ItemEditedChangesX8159b23cAmbiguityException("InlineWebhookProjectsV2ItemEditedChangesX8159b23c matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
      }
      return when {
        matches.InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches -> InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79(fieldValue = requireNotNull(matches.fieldValue), raw = rawObject)
        matches.InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches -> InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227(body = requireNotNull(matches.body), raw = rawObject)
        else -> error("unreachable")
      }
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemEditedChangesX8159b23c) {
      encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemEditedChangesX8159b23c").encodeJsonElement(value.raw)
    }
  }
}

internal data class InlineWebhookProjectsV2ItemEditedChangesX8159b23cInspection(
  public val fieldValue: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d?,
  public val fieldValueDecoded: Boolean,
  public val body: InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db?,
  public val bodyDecoded: Boolean,
  public val InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches: Boolean,
  public val InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches) add("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79")
      if (InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches) add("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227")
    }

  public val size: Int
    get() = names.size
}

private fun inspectInlineWebhookProjectsV2ItemEditedChangesX8159b23c(rawObject: JsonObject): InlineWebhookProjectsV2ItemEditedChangesX8159b23cInspection {
  val fieldValueResult = rawObject["field_value"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d>(element) } }
  val fieldValue = fieldValueResult?.getOrNull()
  val fieldValueDecoded = fieldValueResult?.isSuccess == true
  val bodyResult = rawObject["body"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<InlineWebhookProjectsV2ItemEditedChangesOneOf2BodyX829556db>(element) } }
  val body = bodyResult?.getOrNull()
  val bodyDecoded = bodyResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches = fieldValueDecoded
  val InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches = bodyDecoded
  return InlineWebhookProjectsV2ItemEditedChangesX8159b23cInspection(
    fieldValue = fieldValue,
    fieldValueDecoded = fieldValueDecoded,
    body = body,
    bodyDecoded = bodyDecoded,
    InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches = InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches,
    InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches = InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79Matches) add("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79: branch predicate did not match properties 'field_value'")
      if (!InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227Matches) add("InlineWebhookProjectsV2ItemEditedChangesOneOf2X549ee227: branch predicate did not match properties 'body'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
