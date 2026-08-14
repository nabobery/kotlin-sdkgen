package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_sessions/post/requestBody/content/application~1x-www-form-urlencode
 * d/schema
 */
@Serializable(with = InlineV1AccountSessionsPostRequestFormX7c6d4ca1.Serializer::class)
public class InlineV1AccountSessionsPostRequestFormX7c6d4ca1(
  /**
   * The identifier of the account to create an Account Session for.
   */
  public val account: String,
  /**
   * Each key of the dictionary represents an embedded component, and each embedded component maps to its configuration
   * (e.g. whether it has been enabled or not).
   */
  public val components: InlineV1AccountSessionsPostRequestFormComponentsX621e47a3,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var accountValue: String? = null

    public var account: String
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var componentsValue: InlineV1AccountSessionsPostRequestFormComponentsX621e47a3? = null

    public var components: InlineV1AccountSessionsPostRequestFormComponentsX621e47a3
      get() = requireNotNull(componentsValue) { "components is required" }
      set(`value`) {
        componentsValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1AccountSessionsPostRequestFormX7c6d4ca1 {
      check(accountValue != null) { "account is required" }
      check(componentsValue != null) { "components is required" }
      return InlineV1AccountSessionsPostRequestFormX7c6d4ca1(
        account = account,
        components = components,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormX7c6d4ca1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountSessionsPostRequestFormX7c6d4ca1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountSessionsPostRequestFormX7c6d4ca1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountSessionsPostRequestFormX7c6d4ca1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormX7c6d4ca1 must be a JSON object")
      val account = json.decodeRequired<String>(rawObject, "account")
      val components = json.decodeRequired<InlineV1AccountSessionsPostRequestFormComponentsX621e47a3>(rawObject, "components")
      return InlineV1AccountSessionsPostRequestFormX7c6d4ca1(
        account = account,
        components = components,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountSessionsPostRequestFormX7c6d4ca1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountSessionsPostRequestFormX7c6d4ca1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", value.account)
        put("components", json.encodeToJsonElement(value.components))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountSessionsPostRequestFormX7c6d4ca1(block: InlineV1AccountSessionsPostRequestFormX7c6d4ca1.Builder.() -> Unit): InlineV1AccountSessionsPostRequestFormX7c6d4ca1 = InlineV1AccountSessionsPostRequestFormX7c6d4ca1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1AccountSessionsPostRequestFormX7c6d4ca1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
