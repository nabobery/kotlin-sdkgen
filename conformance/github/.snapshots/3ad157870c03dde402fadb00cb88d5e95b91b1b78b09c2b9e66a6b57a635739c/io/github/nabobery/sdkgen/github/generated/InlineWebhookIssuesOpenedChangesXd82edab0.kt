package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-opened/properties/changes
 */
@Serializable(with = InlineWebhookIssuesOpenedChangesXd82edab0.Serializer::class)
public class InlineWebhookIssuesOpenedChangesXd82edab0(
  /**
   * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
   */
  public val oldIssue: InlineWebhookIssuesOpenedChangesOldIssueX0802eac6?,
  /**
   * A git repository
   */
  public val oldRepository: InlineWebhookIssuesOpenedChangesOldRepositoryX986609ce,
) {
  public class Builder {
    private var oldRepositoryValue: InlineWebhookIssuesOpenedChangesOldRepositoryX986609ce? = null

    public var oldRepository: InlineWebhookIssuesOpenedChangesOldRepositoryX986609ce
      get() = requireNotNull(oldRepositoryValue) { "oldRepository is required" }
      set(`value`) {
        oldRepositoryValue = value
      }

    private var oldIssueState: FieldState<InlineWebhookIssuesOpenedChangesOldIssueX0802eac6?> =
        FieldState.Absent

    /**
     * The [issue](https://docs.github.com/rest/issues/issues#get-an-issue) itself.
     * Required nullable field; assigning `null` records present-null.
     */
    public var oldIssue: InlineWebhookIssuesOpenedChangesOldIssueX0802eac6?
      get() = oldIssueState.valueOrNull()
      set(`value`) {
        oldIssueState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookIssuesOpenedChangesXd82edab0 {
      check(oldRepositoryValue != null) { "oldRepository is required" }
      check(oldIssueState !== FieldState.Absent) { "oldIssue is required, even when null" }
      return InlineWebhookIssuesOpenedChangesXd82edab0(
        oldIssue = oldIssueState.valueOrNull(),
        oldRepository = oldRepository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesOpenedChangesXd82edab0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesOpenedChangesXd82edab0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesOpenedChangesXd82edab0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesOpenedChangesXd82edab0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesOpenedChangesXd82edab0 must be a JSON object")
      val oldRepository = json.decodeRequired<InlineWebhookIssuesOpenedChangesOldRepositoryX986609ce>(rawObject, "old_repository")
      if (!rawObject.containsKey("old_issue")) {
        throw SerializationException("InlineWebhookIssuesOpenedChangesXd82edab0 is missing required property 'old_issue'")
      }
      val oldIssue = rawObject["old_issue"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookIssuesOpenedChangesOldIssueX0802eac6?>(requireNotNull(element)) }
      return InlineWebhookIssuesOpenedChangesXd82edab0(
        oldIssue = oldIssue,
        oldRepository = oldRepository,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesOpenedChangesXd82edab0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesOpenedChangesXd82edab0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("old_issue", value.oldIssue?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("old_repository", json.encodeToJsonElement(value.oldRepository))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesOpenedChangesXd82edab0(block: InlineWebhookIssuesOpenedChangesXd82edab0.Builder.() -> Unit): InlineWebhookIssuesOpenedChangesXd82edab0 = InlineWebhookIssuesOpenedChangesXd82edab0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesOpenedChangesXd82edab0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookIssuesOpenedChangesXd82edab0 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
