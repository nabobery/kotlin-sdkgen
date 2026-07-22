package com.nabobery.sdkgen.generated.stripe

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1account_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema
 */
@Serializable(with = InlineV1AccountLinksPostRequestFormX59976192.Serializer::class)
public class InlineV1AccountLinksPostRequestFormX59976192(
    /**
     * The identifier of the account to create an account link for.
     */
    public val account: String,
    /**
     * The type of account link the user is requesting.
     *
     * You can create Account Links of type `account_update` only for connected accounts where your platform is
     * responsible for collecting requirements, including Custom accounts. You can't create them for accounts that have
     * access to a Stripe-hosted Dashboard. If you use [Connect embedded
     * components](/connect/get-started-connect-embedded-components), you can include components that allow your connected
     * accounts to update their own information. For an account without Stripe-hosted Dashboard access where Stripe is
     * liable for negative balances, you must use embedded components.
     */
    public val type: InlineV1AccountLinksPostRequestFormTypeX021e3a7f,
    /**
     * The collect parameter is deprecated. Use `collection_options` instead.
     */
    public val collect: InlineV1AccountLinksPostRequestFormCollectXcde1cfeb? = null,
    /**
     * Specifies the requirements that Stripe collects from connected accounts in the Connect Onboarding flow.
     */
    public val collectionOptions: InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8? = null,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * The URL the user will be redirected to if the account link is expired, has been previously-visited, or is otherwise
     * invalid. The URL you specify should attempt to generate a new account link with the same parameters used to create
     * the original account link, then redirect the user to the new account link's URL so they can continue with Connect
     * Onboarding. If a new account link cannot be generated or the redirect fails you should display a useful error to
     * the user.
     */
    public val refreshUrl: String? = null,
    /**
     * The URL that the user will be redirected to upon leaving or completing the linked flow.
     */
    public val returnUrl: String? = null,
) {
    public class Builder {
        private var accountValue: String? = null

        public var account: String
            get() = requireNotNull(accountValue) { "account is required" }
            set(`value`) {
                accountValue = value
            }

        private var typeValue: InlineV1AccountLinksPostRequestFormTypeX021e3a7f? = null

        public var type: InlineV1AccountLinksPostRequestFormTypeX021e3a7f
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        /**
         * The collect parameter is deprecated. Use `collection_options` instead.
         */
        public var collect: InlineV1AccountLinksPostRequestFormCollectXcde1cfeb? = null

        /**
         * Specifies the requirements that Stripe collects from connected accounts in the Connect Onboarding flow.
         */
        public var collectionOptions: InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8? =
            null

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * The URL the user will be redirected to if the account link is expired, has been previously-visited, or is
         * otherwise invalid. The URL you specify should attempt to generate a new account link with the same parameters
         * used to create the original account link, then redirect the user to the new account link's URL so they can
         * continue with Connect Onboarding. If a new account link cannot be generated or the redirect fails you should
         * display a useful error to the user.
         */
        public var refreshUrl: String? = null

        /**
         * The URL that the user will be redirected to upon leaving or completing the linked flow.
         */
        public var returnUrl: String? = null

        public fun build(): InlineV1AccountLinksPostRequestFormX59976192 {
            check(accountValue != null) { "account is required" }
            check(typeValue != null) { "type is required" }
            return InlineV1AccountLinksPostRequestFormX59976192(
                account = account,
                type = type,
                collect = collect,
                collectionOptions = collectionOptions,
                expand = expand,
                refreshUrl = refreshUrl,
                returnUrl = returnUrl,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1AccountLinksPostRequestFormX59976192 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1AccountLinksPostRequestFormX59976192> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountLinksPostRequestFormX59976192 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountLinksPostRequestFormX59976192")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1AccountLinksPostRequestFormX59976192 must be a JSON object",
                    )
            val account = json.decodeRequired<String>(rawObject, "account")
            val type = json.decodeRequired<InlineV1AccountLinksPostRequestFormTypeX021e3a7f>(rawObject, "type")
            return InlineV1AccountLinksPostRequestFormX59976192(
                account = account,
                type = type,
                collect =
                    rawObject["collect"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountLinksPostRequestFormCollectXcde1cfeb>(it)
                    },
                collectionOptions =
                    rawObject["collection_options"]?.let {
                        json.decodeFromJsonElement<InlineV1AccountLinksPostRequestFormCollectionOptionsXb477fac8>(it)
                    },
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                refreshUrl = rawObject["refresh_url"]?.let { json.decodeFromJsonElement<String>(it) },
                returnUrl = rawObject["return_url"]?.let { json.decodeFromJsonElement<String>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountLinksPostRequestFormX59976192,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountLinksPostRequestFormX59976192")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("account", value.account)
                    put("type", json.encodeToJsonElement(value.type))
                    value.collect?.let { put("collect", json.encodeToJsonElement(it)) }
                    value.collectionOptions?.let { put("collection_options", json.encodeToJsonElement(it)) }
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.refreshUrl?.let { put("refresh_url", it) }
                    value.returnUrl?.let { put("return_url", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1AccountLinksPostRequestFormX59976192(
    block: InlineV1AccountLinksPostRequestFormX59976192.Builder.() -> Unit,
): InlineV1AccountLinksPostRequestFormX59976192 = InlineV1AccountLinksPostRequestFormX59976192.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1AccountLinksPostRequestFormX59976192 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
