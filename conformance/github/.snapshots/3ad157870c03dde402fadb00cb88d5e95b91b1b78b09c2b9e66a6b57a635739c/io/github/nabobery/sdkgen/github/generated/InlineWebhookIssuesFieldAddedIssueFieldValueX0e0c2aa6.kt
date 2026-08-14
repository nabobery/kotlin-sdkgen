package io.github.nabobery.sdkgen.github.generated

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
 * The value that was set or updated for the issue field. When updating an existing value, the previous value is
 * available in `changes`.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field_value
 */
@Serializable(with = InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6.Serializer::class)
public class InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6(
  /**
   * The unique identifier of the issue field value.
   */
  public val id: Int,
  /**
   * The selected option details. Present for single_select field types.
   */
  public val option: InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401? = null,
  options: List<InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac>? = null,
  /**
   * The value of the field. Present for text, date, and number field types.
   */
  public val `value`: InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8? = null,
  /**
   * The identifier of the selected option. Present for single_select field types.
   */
  public val valueId: Int? = null,
  valueIds: List<Int>? = null,
) {
  /**
   * The selected option details. Present for multi_select field types.
   */
  public val options: List<InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac>? =
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
    public var option: InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401? = null

    private var optionsValue:
        List<InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac>? = null

    /**
     * The selected option details. Present for multi_select field types.
     */
    public var options: List<InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac>?
      get() = optionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The value of the field. Present for text, date, and number field types.
     */
    public var `value`: InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8? = null

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

    public fun build(): InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6 {
      check(idValue != null) { "id is required" }
      return InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      return InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6(
        id = id,
        option = rawObject["option"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401>(it) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<List<InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac>>(it) },
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesFieldAddedIssueFieldValueValueX9f6f50d8?>(element) },
        valueId = rawObject["value_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        valueIds = rawObject["value_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6")
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

public fun inlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6(block: InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6.Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6 = InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesFieldAddedIssueFieldValueX0e0c2aa6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
