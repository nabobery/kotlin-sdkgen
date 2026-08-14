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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes/properties/homepage.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-repository-edited/properties/changes/properties/homepage
 */
@Serializable(with = InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a.Serializer::class)
public class InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a(
  public val from: String?,
) {
  public class Builder {
    private var fromState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var from: String?
      get() = fromState.valueOrNull()
      set(`value`) {
        fromState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a {
      check(fromState !== FieldState.Absent) { "from is required, even when null" }
      return InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a(
        from = fromState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a must be a JSON object")
      if (!rawObject.containsKey("from")) {
        throw SerializationException("InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a is missing required property 'from'")
      }
      val from = rawObject["from"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a(block: InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a.Builder.() -> Unit): InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a = InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookRepositoryEditedChangesHomepageXd1ef4c7a property '" + name + "' is not nullable")
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
