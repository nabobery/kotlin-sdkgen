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
 * The previous value of the issue field before the update.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/changes/properties/issue_field
 * _value/properties/from
 */
@Serializable(with = InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77.Serializer::class)
public class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77(
  /**
   * The unique identifier of the issue field value.
   */
  public val id: Int,
  /**
   * The previously selected option details. Present for single_select field types.
   */
  public val option: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionX1b273967? = null,
  options: List<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183>? = null,
  /**
   * The previous value. Present for text, date, and number field types.
   */
  public val `value`: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1? = null,
  /**
   * The identifier of the previously selected option. Present for single_select field types.
   */
  public val valueId: Int? = null,
  valueIds: List<Int>? = null,
) {
  /**
   * The previously selected option details. Present for multi_select field types.
   */
  public val options:
      List<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183>? =
      options?.let { collection0 -> collection0.toList() }

  /**
   * The identifiers of the previously selected options. Present for multi_select field types.
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
     * The previously selected option details. Present for single_select field types.
     */
    public var option: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionX1b273967? =
        null

    private var optionsValue:
        List<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183>? = null

    /**
     * The previously selected option details. Present for multi_select field types.
     */
    public var options:
        List<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183>?
      get() = optionsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The previous value. Present for text, date, and number field types.
     */
    public var `value`: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1? =
        null

    /**
     * The identifier of the previously selected option. Present for single_select field types.
     */
    public var valueId: Int? = null

    private var valueIdsValue: List<Int>? = null

    /**
     * The identifiers of the previously selected options. Present for multi_select field types.
     */
    public var valueIds: List<Int>?
      get() = valueIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        valueIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77 {
      check(idValue != null) { "id is required" }
      return InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      return InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77(
        id = id,
        option = rawObject["option"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionX1b273967>(it) },
        options = rawObject["options"]?.let { json.decodeFromJsonElement<List<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183>>(it) },
        value = rawObject["value"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromValueX66acfde1?>(element) },
        valueId = rawObject["value_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        valueIds = rawObject["value_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77")
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

public fun inlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77(block: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77.Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77 = InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
