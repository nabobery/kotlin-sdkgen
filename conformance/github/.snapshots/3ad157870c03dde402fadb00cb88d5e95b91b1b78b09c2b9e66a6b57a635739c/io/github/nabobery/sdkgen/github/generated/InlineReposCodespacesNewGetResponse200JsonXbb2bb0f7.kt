package io.github.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1new/get/responses/200/content/application~1
 * json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1codespaces~1new/get/responses/200/content/application~1
 * json/schema
 */
@Serializable(with = InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7.Serializer::class)
public class InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7(
  public val billableOwner: SimpleUser? = null,
  public val defaults: InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c? = null,
) {
  public class Builder {
    public var billableOwner: SimpleUser? = null

    public var defaults: InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c? = null

    public fun build(): InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7 = InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7(
      billableOwner = billableOwner,
      defaults = defaults,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7 must be a JSON object")
      return InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7(
        billableOwner = rawObject["billable_owner"]?.let { json.decodeFromJsonElement<SimpleUser>(it) },
        defaults = rawObject["defaults"]?.let { json.decodeFromJsonElement<InlineReposCodespacesNewGetResponse200JsonDefaultsXe35e316c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billableOwner?.let { put("billable_owner", json.encodeToJsonElement(it)) }
        value.defaults?.let { put("defaults", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodespacesNewGetResponse200JsonXbb2bb0f7(block: InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7.Builder.() -> Unit): InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7 = InlineReposCodespacesNewGetResponse200JsonXbb2bb0f7.build(block)
