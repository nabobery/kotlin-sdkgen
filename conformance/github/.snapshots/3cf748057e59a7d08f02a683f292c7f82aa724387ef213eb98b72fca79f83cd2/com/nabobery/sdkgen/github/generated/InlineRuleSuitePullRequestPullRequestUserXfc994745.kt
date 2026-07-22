package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
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
 * The user who created the pull request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/rule-suite-pull-request/properties/pull_request/properties/user
 */
@Serializable(with = InlineRuleSuitePullRequestPullRequestUserXfc994745.Serializer::class)
public class InlineRuleSuitePullRequestPullRequestUserXfc994745(
  /**
   * The unique identifier of the user.
   */
  public val id: Int? = null,
  /**
   * The handle for the GitHub user account.
   */
  public val login: String? = null,
  /**
   * The type of the user.
   */
  public val type: String? = null,
) {
  public class Builder {
    /**
     * The unique identifier of the user.
     */
    public var id: Int? = null

    /**
     * The handle for the GitHub user account.
     */
    public var login: String? = null

    /**
     * The type of the user.
     */
    public var type: String? = null

    public fun build(): InlineRuleSuitePullRequestPullRequestUserXfc994745 = InlineRuleSuitePullRequestPullRequestUserXfc994745(
      id = id,
      login = login,
      type = type,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestUserXfc994745 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineRuleSuitePullRequestPullRequestUserXfc994745> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineRuleSuitePullRequestPullRequestUserXfc994745 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineRuleSuitePullRequestPullRequestUserXfc994745")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineRuleSuitePullRequestPullRequestUserXfc994745 must be a JSON object")
      return InlineRuleSuitePullRequestPullRequestUserXfc994745(
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        login = rawObject["login"]?.let { json.decodeFromJsonElement<String>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineRuleSuitePullRequestPullRequestUserXfc994745) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineRuleSuitePullRequestPullRequestUserXfc994745")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.login?.let { put("login", it) }
        value.type?.let { put("type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineRuleSuitePullRequestPullRequestUserXfc994745(block: InlineRuleSuitePullRequestPullRequestUserXfc994745.Builder.() -> Unit): InlineRuleSuitePullRequestPullRequestUserXfc994745 = InlineRuleSuitePullRequestPullRequestUserXfc994745.build(block)
