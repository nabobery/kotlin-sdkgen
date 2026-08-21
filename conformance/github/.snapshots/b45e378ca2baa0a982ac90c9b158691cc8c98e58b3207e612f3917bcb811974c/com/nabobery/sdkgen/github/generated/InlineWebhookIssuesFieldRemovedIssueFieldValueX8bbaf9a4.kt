package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The value that was cleared from the issue field.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-removed/properties/issue_field_value
 */
@Serializable(with = InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4.Serializer::class)
public class InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4(
  /**
   * The unique identifier of the issue field value.
   */
  public val id: Int,
  /**
   * The selected option details. Present for single_select field types.
   */
  public val option: InlineWebhookIssuesFieldRemovedIssueFieldValueOptionX7f29bb3d? = null,
  options: List<InlineWebhookIssuesFieldRemovedIssueFieldValueOptionsItemX2fc3b8f1>? = null,
  /**
   * The value of the field. Present for text, date, and number field types.
   */
  public val `value`: InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19? = null,
  /**
   * The identifier of the selected option. Present for single_select field types.
   */
  public val valueId: Int? = null,
  valueIds: List<Int>? = null,
) {
  /**
   * The selected option details. Present for multi_select field types.
   */
  public val options: List<InlineWebhookIssuesFieldRemovedIssueFieldValueOptionsItemX2fc3b8f1>? =
      options?.let { collection0 -> collection0.toList() }

  /**
   * The identifiers of the selected options. Present for multi_select field types.
   */
  public val valueIds: List<Int>? = valueIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * The selected option details. Present for single_select field types.
     */
    public var option: InlineWebhookIssuesFieldRemovedIssueFieldValueOptionX7f29bb3d? = null

    private var optionsValue:
        List<InlineWebhookIssuesFieldRemovedIssueFieldValueOptionsItemX2fc3b8f1>? = null

    /**
     * The selected option details. Present for multi_select field types.
     */
    public var options: List<InlineWebhookIssuesFieldRemovedIssueFieldValueOptionsItemX2fc3b8f1>?
      get() = optionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The value of the field. Present for text, date, and number field types.
     */
    public var `value`: InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19? = null

    /**
     * The identifier of the selected option. Present for single_select field types.
     */
    public var valueId: Int? = null

    private var valueIdsValue: List<Int>? = null

    /**
     * The identifiers of the selected options. Present for multi_select field types.
     */
    public var valueIds: List<Int>?
      get() = valueIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        valueIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4 {
      check(idValue != null) { "id is required" }
      return InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4(
        id = id,
        option = option,
        options = options,
        value = value,
        valueId = valueId,
        valueIds = valueIds,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      return InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4(
        id = id,
        option = rawObject["option"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesFieldRemovedIssueFieldValueOptionX7f29bb3d>(it) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<List<InlineWebhookIssuesFieldRemovedIssueFieldValueOptionsItemX2fc3b8f1>>(it) },
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesFieldRemovedIssueFieldValueValueX849d6e19?>(element) },
        valueId = rawObject["value_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        valueIds = rawObject["value_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.option?.let { put("option", json.encodeToJsonElement(it)) }
        value.options?.let { put("options", json.encodeToJsonElement(it)) }
        value.value?.let { put("value", json.encodeToJsonElement(it)) }
        value.valueId?.let { put("value_id", json.encodeToJsonElement(it)) }
        value.valueIds?.let { put("value_ids", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4(block: InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4.Builder.() -> Unit): InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4 = InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesFieldRemovedIssueFieldValueX8bbaf9a4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
