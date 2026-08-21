package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/branches/items/properties/commit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/branches/items/properties/commit
 */
@Serializable(with = InlineWebhookStatusBranchesItemCommitX255ec330.Serializer::class)
public class InlineWebhookStatusBranchesItemCommitX255ec330(
  public val sha: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String?,
) {
  public class Builder {
    private var shaState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sha: String?
      get() = shaState.valueOrNull()
      set(`value`) {
        shaState = value.toNullableFieldState()
      }

    private var urlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        urlState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookStatusBranchesItemCommitX255ec330 {
      check(shaState !== FieldState.Absent) { "sha is required, even when null" }
      check(urlState !== FieldState.Absent) { "url is required, even when null" }
      return InlineWebhookStatusBranchesItemCommitX255ec330(
        sha = shaState.valueOrNull(),
        url = urlState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookStatusBranchesItemCommitX255ec330 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookStatusBranchesItemCommitX255ec330> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookStatusBranchesItemCommitX255ec330 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookStatusBranchesItemCommitX255ec330")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookStatusBranchesItemCommitX255ec330 must be a JSON object")
      if (!rawObject.containsKey("sha")) {
        throw SerializationException("InlineWebhookStatusBranchesItemCommitX255ec330 is missing required property 'sha'")
      }
      val sha = rawObject["sha"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("url")) {
        throw SerializationException("InlineWebhookStatusBranchesItemCommitX255ec330 is missing required property 'url'")
      }
      val url = rawObject["url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookStatusBranchesItemCommitX255ec330(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusBranchesItemCommitX255ec330) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookStatusBranchesItemCommitX255ec330")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookStatusBranchesItemCommitX255ec330(block: InlineWebhookStatusBranchesItemCommitX255ec330.Builder.() -> Unit): InlineWebhookStatusBranchesItemCommitX255ec330 = InlineWebhookStatusBranchesItemCommitX255ec330.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineWebhookStatusBranchesItemCommitX255ec330 property '" + name + "' is not nullable")
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
