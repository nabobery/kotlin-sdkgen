package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1statuses~1{sha}/post/requestBody/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1statuses~1{sha}/post/requestBody/content/application~1j
 * son/schema
 */
@Serializable(with = InlineReposStatusesPostRequestJsonXf26c31ed.Serializer::class)
public class InlineReposStatusesPostRequestJsonXf26c31ed(
  /**
   * The state of the status.
   */
  public val state: InlineReposStatusesPostRequestJsonStateXbfdad4b2,
  /**
   * A string label to differentiate this status from the status of other systems. This field is case-insensitive.
   */
  public val context: String? = null,
  /**
   * A short description of the status.
   */
  public val description: String? = null,
  /**
   * The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily
   * see the source of the status.
   * For example, if your continuous integration system is posting build status, you would want to provide the deep link
   * for the build output for this specific SHA:
   * `http://ci.example.com/user/repo/build/sha`
   */
  public val targetUrl: String? = null,
) {
  public class Builder {
    private var stateValue: InlineReposStatusesPostRequestJsonStateXbfdad4b2? = null

    public var state: InlineReposStatusesPostRequestJsonStateXbfdad4b2
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    /**
     * A string label to differentiate this status from the status of other systems. This field is case-insensitive.
     */
    public var context: String? = null

    /**
     * A short description of the status.
     */
    public var description: String? = null

    /**
     * The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily
     * see the source of the status.
     * For example, if your continuous integration system is posting build status, you would want to provide the deep
     * link for the build output for this specific SHA:
     * `http://ci.example.com/user/repo/build/sha`
     */
    public var targetUrl: String? = null

    public fun build(): InlineReposStatusesPostRequestJsonXf26c31ed {
      check(stateValue != null) { "state is required" }
      return InlineReposStatusesPostRequestJsonXf26c31ed(
        state = state,
        context = context,
        description = description,
        targetUrl = targetUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposStatusesPostRequestJsonXf26c31ed = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposStatusesPostRequestJsonXf26c31ed> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposStatusesPostRequestJsonXf26c31ed {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposStatusesPostRequestJsonXf26c31ed")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposStatusesPostRequestJsonXf26c31ed must be a JSON object")
      val state = json.decodeRequired<InlineReposStatusesPostRequestJsonStateXbfdad4b2>(rawObject, "state")
      return InlineReposStatusesPostRequestJsonXf26c31ed(
        state = state,
        context = rawObject["context"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        targetUrl = rawObject["target_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposStatusesPostRequestJsonXf26c31ed) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposStatusesPostRequestJsonXf26c31ed")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("state", json.encodeToJsonElement(value.state))
        value.context?.let { put("context", it) }
        value.description?.let { put("description", it) }
        value.targetUrl?.let { put("target_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposStatusesPostRequestJsonXf26c31ed(block: InlineReposStatusesPostRequestJsonXf26c31ed.Builder.() -> Unit): InlineReposStatusesPostRequestJsonXf26c31ed = InlineReposStatusesPostRequestJsonXf26c31ed.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposStatusesPostRequestJsonXf26c31ed is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
